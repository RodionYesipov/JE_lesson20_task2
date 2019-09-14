package com.yesipov;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(User.this);
    }

    public User() {
    }
}