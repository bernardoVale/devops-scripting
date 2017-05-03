package com.avenuecode.devops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.experimental.categories.Category;
import org.junit.*;
import static org.junit.Assert.*;


@Category(IntegrationTest.class)
public class HelloWorldTest {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new FirefoxDriver();
    }

    @AfterClass
    public static void cleanUp(){
        driver.quit();
    }

    @Test
    public void shouldSayHelloWorld(){
        driver.get("http://localhost:9090/helloworld");
        assertEquals("Hello World!", driver.findElement(By.tagName("body")).getText());
    }
}