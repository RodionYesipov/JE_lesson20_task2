package com.yesipov;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;

public class MyGson {
    public static User parse(Map<String,String> params, Class clazz) throws IllegalAccessException, InstantiationException {
        User user = (User)clazz.newInstance();

        Field[] fields = clazz.getDeclaredFields();
        boolean privateCheck = Modifier.isPrivate(clazz.getModifiers());

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            /////
            if(fields[i].getType().equals(int.class)) {
                fields[i].set(user, Integer.parseInt(params.get(fields[i].getName())));
            } else {
                fields[i].set(user, params.get(fields[i].getName()));
            }
        }

        return user;
    }
}
