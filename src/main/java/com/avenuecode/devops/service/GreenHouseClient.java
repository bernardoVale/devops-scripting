package com.avenuecode.devops.service;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bernardovale on 5/3/17.
 */
public class GreenHouseClient {

    private HttpClient client;
    private static String officesURL = "https://api.greenhouse.io/v1/boards/avenuecode/embed/offices";

    public GreenHouseClient() {
        this.client = HttpClientBuilder.create().build();

    }

    public BufferedReader GetOffices() throws IOException {
        HttpGet request = new HttpGet(officesURL);
        HttpResponse response = client.execute(request);

        return new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
    }
}

