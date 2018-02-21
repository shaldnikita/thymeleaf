package ru.shaldnikita.thymeleaf.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ReflectionUtils {

    public static List<String> getAllStringConstants(Class clazz) {

        List<String> values = new ArrayList<>();
        for (Field field : clazz.getDeclaredFields()) {
            try {
                values.add((String) field.get(null));
            } catch (Exception e) {
            }
        }
        return values;

    }
}
