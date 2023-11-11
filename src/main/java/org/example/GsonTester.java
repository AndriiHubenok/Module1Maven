package org.example;

import com.google.gson.Gson;

public class GsonTester {

    public void test() {
        Person developer = new Person();
        developer.setName("Andrii");
        developer.setLastName("Hubenok");

        System.out.println(new Gson().toJson(developer));
    }
}
