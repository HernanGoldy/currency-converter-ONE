package com.alura.models;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PairConversion {
    String apiKey = "36f87b73dfe87e66ece53aa2";
    HttpClient client = HttpClient.newHttpClient();
    Gson gson = new Gson();

    public PairChange pairUsdArs(double monto) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/USD/ARS/" + monto))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        PairChange pairChange = gson.fromJson(json, PairChange.class);
        return pairChange;
    }

    public PairChange pairArsUsd(double monto) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/ARS/USD/" + monto))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        PairChange pairChange = gson.fromJson(json, PairChange.class);
        return pairChange;
    }

    public PairChange pairUsdBrl(double monto) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/USD/BRL/" + monto))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        PairChange pairChange = gson.fromJson(json, PairChange.class);
        return pairChange;
    }

    public PairChange pairBrlUsd(double monto) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/BRL/USD/" + monto))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        PairChange pairChange = gson.fromJson(json, PairChange.class);
        return pairChange;
    }

    public PairChange pairUsdCop(double monto) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/USD/COP/" + monto))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        PairChange pairChange = gson.fromJson(json, PairChange.class);
        return pairChange;
    }

    public PairChange pairCopUsd(double monto) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/COP/USD/" + monto))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        PairChange pairChange = gson.fromJson(json, PairChange.class);
        return pairChange;
    }
}
