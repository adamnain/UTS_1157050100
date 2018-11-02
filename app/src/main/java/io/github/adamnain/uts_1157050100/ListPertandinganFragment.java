package io.github.adamnain.uts_1157050100;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import io.github.adamnain.uts_1157050100.adapter.PertandinganAdapter;
import io.github.adamnain.uts_1157050100.model.Event;
import io.github.adamnain.uts_1157050100.model.EventResponse;
import io.github.adamnain.uts_1157050100.service.UtilsApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListPertandinganFragment extends Fragment {

    View v;
    ArrayList<Event> listPertandingan;
    RecyclerView mRecyclerView;
    PertandinganAdapter mAdapter;
    ProgressDialog loading;
    private RecyclerView rvPertandingan;

    public ListPertandinganFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_list_pertandingan, container, false);
        rvPertandingan = v.findViewById(R.id.rv_pertandingan);
        listPertandingan = new ArrayList<>();

        loading = ProgressDialog.show(getActivity(), null, "Harap Tunggu...", true, false);

        Call<EventResponse> call = UtilsApi.getAPIService().getAllPertandingan();
        call.enqueue(new Callback<EventResponse>() {
            @Override
            public void onResponse(Call<EventResponse> call, Response<EventResponse> response) {
                if (response.isSuccessful()){
                    loading.dismiss();

                    listPertandingan = (ArrayList<Event>) response.body().getEvents();

                    rvPertandingan.setAdapter(new PertandinganAdapter(getActivity(), listPertandingan));
                    mAdapter.notifyDataSetChanged();
                }
                else {
                    Toast.makeText(getActivity(), "not correct", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<EventResponse> call, Throwable t) {
                loading.dismiss();

                Toast.makeText(getActivity(), "Koneksi Bermasalah", Toast.LENGTH_SHORT).show();
            }
        });

        mRecyclerView = v.findViewById(R.id.rv_pertandingan);
        mAdapter = new PertandinganAdapter(getActivity(), listPertandingan);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return v;
    }

}
