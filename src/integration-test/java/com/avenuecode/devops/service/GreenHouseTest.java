package com.avenuecode.devops.service;

import com.avenuecode.devops.IntegrationTest;
import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

@Category(IntegrationTest.class)
public class GreenHouseTest {

    static GreenHouseClient client;

    @BeforeClass
    public static void setup() {
        client = new GreenHouseClient();
    }

    @Test
    public void testGetOfficesShouldBeAnArray(){
        try {
            BufferedReader rd = client.GetOffices();
            JsonObject object = Json.parse(rd).asObject();
            JsonArray offices = object.get("offices").asArray();

            assertTrue(offices.isArray());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
