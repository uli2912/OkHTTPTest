package org.example;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        OkHttpClient okHttpClient = new OkHttpClient();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        String baseUrl = "https://www.7timer.info/bin/astro.php?lon=113.2&lat=23.1&ac=0&unit=metric&output=json&tzshift=0";
        HttpUrl.Builder weatherBuilder =  HttpUrl.parse(baseUrl).newBuilder();

        String url = weatherBuilder.build().toString();

        Request request = new Request.Builder().url(url).build();

        Call call = okHttpClient.newCall(request);
        try {

            Response response = call.execute();

            String json = response.body().string();

            Weather weather = objectMapper.readValue(json, Weather.class);
            System.out.println(weather.getProduct());
            System.out.println(weather.getInit());

            weather.getDataSeries().forEach(x -> System.out.println(x.getWind1om()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}