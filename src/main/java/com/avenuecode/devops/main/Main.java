package com.avenuecode.devops.main;

import com.avenuecode.devops.model.Office;
import com.avenuecode.devops.service.GreenHouseClient;
import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by bernardovale on 5/3/17.
 */
public class Main {

    public static void main(String[] args) {

        GreenHouseClient client = new GreenHouseClient();

        try {
            BufferedReader rd = client.GetOffices();

            JsonObject object = Json.parse(rd).asObject();

            JsonArray offices = object.get("offices").asArray();

            for (JsonValue value : offices) {

                JsonObject jsonOffice  = value.asObject();

                Office office = new Office(jsonOffice.get("id").asInt(),
                        jsonOffice.get("name").asString(), "");
                System.out.println("Office:" + office.getName());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
