package com.yesipov;
import java.util.HashMap;
import java.util.Map;

/**
 2*) Написать аналог библиотеки GSON с использованием рефлексии:
 class User {
 private String name;
 private int age;
 }

 Map<String, String> params = { "name":"alex", "age":"22" }
 myGson.parse(params, User.class);

 Т.е. метод myGson.parse() должен создать объект класса User, и заполнить его приватные поля из map,
 беря соответствующие key-value если они есть.*
 * */

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Map<String, String> params = new HashMap<>();
        params.put("name", "Petr");
        params.put("age", "55");
        User user = MyGson.parse(params, User.class);

        System.out.println(user);
    }
}
