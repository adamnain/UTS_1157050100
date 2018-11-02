package io.github.adamnain.uts_1157050100.service;

import io.github.adamnain.uts_1157050100.model.EventResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPoints {
    @GET("api/v1/json/1/eventspastleague.php?id=4328")
    Call<EventResponse> getAllPertandingan();
}
