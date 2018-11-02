package io.github.adamnain.uts_1157050100.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import io.github.adamnain.uts_1157050100.DetailActivity;
import io.github.adamnain.uts_1157050100.R;
import io.github.adamnain.uts_1157050100.model.Event;

public class PertandinganAdapter extends RecyclerView.Adapter<PertandinganAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Event> listPertandingan;

    public PertandinganAdapter(Context context, ArrayList<Event> listPertandingan){
        this.context = context;
        this.listPertandingan = listPertandingan;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_pertandingan, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mItemView.setLayoutParams(layoutParams);

        return new ViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Event event = listPertandingan.get(position);
        holder.tvDate.setText(event.getDateEvent());
        holder.tvHomeTeam.setText(event.getStrHomeTeam());
        holder.tvHomeScore.setText(""+event.getIntHomeScore());
        holder.tvAwayTeam.setText(event.getStrAwayTeam());
        holder.tvAwayScore.setText(""+event.getIntHomeScore());
    }

    @Override
    public int getItemCount() {
        return listPertandingan.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private CardView cvPertandingan;
        private TextView tvHomeTeam, tvHomeScore, tvAwayTeam, tvAwayScore, tvDate;
        final PertandinganAdapter mAdapter;


        public ViewHolder(View itemView, PertandinganAdapter adapter) {
            super(itemView);

            cvPertandingan = itemView.findViewById(R.id.cv_pertandingan);
            tvHomeTeam = itemView.findViewById(R.id.tv_home_team);
            tvHomeScore = itemView.findViewById(R.id.tv_home_score);
            tvAwayTeam = itemView.findViewById(R.id.tv_away_team);
            tvAwayScore = itemView.findViewById(R.id.tv_away_score);
            tvDate = itemView.findViewById(R.id.tv_date);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int mPosition = getLayoutPosition();
            Event event = listPertandingan.get(mPosition);

            Intent i = new Intent(context, DetailActivity.class);
            i.putExtra("homeTeam", event.getStrHomeTeam());
            i.putExtra("homeScore", event.getIntHomeScore());
            i.putExtra("homeGoalkeeper", event.getStrHomeLineupGoalkeeper());
            i.putExtra("homeDefense", event.getStrHomeLineupDefense());
            i.putExtra("homeMidfield", event.getStrHomeLineupMidfield());
            i.putExtra("homeForward", event.getStrHomeLineupForward());

            i.putExtra("awayTeam", event.getStrAwayTeam());
            i.putExtra("awayScore", event.getIntAwayScore());
            i.putExtra("awayGoalkeeper", event.getStrAwayLineupGoalkeeper());
            i.putExtra("awayDefense", event.getStrAwayLineupDefense());
            i.putExtra("awayMidfield", event.getStrAwayLineupMidfield());
            i.putExtra("awayForward", event.getStrAwayLineupForward());

            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
            mAdapter.notifyDataSetChanged();

        }
    }


}
