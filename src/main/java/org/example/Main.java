package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String jsonString1 = "{\"bid\":\"1\",\"businessAddress\":\"pune\",\"businessEmail\":\"demo@Gmmail.com\",\"businessName\":\"EYWA\",\"businessUrl\":\"www.demo.com\",\"contactNumber\":\"1234567890\",\"countryOfRegistration\":\"India\"}";
        String jsonString2 = "{\"bid\":\"1\",\"capacity\":120,\"licenNumber\":\"asdfg1234\",\"monthAndYear\":\"01-2024\",\"pid\":\"2\",\"projectAddress\":\"hadapasar\",\"projectName\":\"poonawala\",\"projectType\":\"SOLAR\"}";

        // Remove forward slashes
        String cleanedString1 = jsonString1.replaceAll("/", "");
        String cleanedString2 = jsonString2.replaceAll("/", "");

        // Remove backslashes
        cleanedString1 = cleanedString1.replaceAll("\\\\", "");
        cleanedString2 = cleanedString2.replaceAll("\\\\", "");

        // Print the cleaned strings
        System.out.println("Cleaned String 1: " + cleanedString1);
        System.out.println("Cleaned String 2: " + cleanedString2);

    }
}