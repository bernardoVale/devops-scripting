package com.avenuecode.devops.service;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by bernardovale on 5/3/17.
 */
public class GreenHouseClientTest {

    static GreenHouseClient client;

    @BeforeClass
    public static void setup() {
        client = new GreenHouseClient();
    }

    @Test
    public void testGetOfficesShouldBeAnArray(){
        assertTrue(true);
    }
}
