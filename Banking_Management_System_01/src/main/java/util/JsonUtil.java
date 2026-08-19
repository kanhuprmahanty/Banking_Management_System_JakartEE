package util;

import com.google.gson.Gson;

public class JsonUtil {

    private static final Gson gson =
            new Gson();

    public static String toJson(
            Object object){

        return gson.toJson(object);
    }
}