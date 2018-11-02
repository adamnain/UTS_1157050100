package io.github.adamnain.uts_1157050100.service;

public class UtilsApi {

    public static final String BASE_URL_API = " https://www.thesportsdb.com/";

    // Mendeklarasikan Interface BaseApiService
    public static EndPoints getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(EndPoints.class);
    }

}