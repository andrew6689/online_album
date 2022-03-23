package com.aiwinn.album.manager;

import java.util.HashMap;
import java.util.Map;

public class MapMethodManager {

    public static final String V = "1.0";

    public static final String FORMAT = "json";
	
    private static Map<String, String> methodNameMap = new HashMap<>();

    static {

    }

    public static String getMethod(String method) {
        return methodNameMap.get(method);
    }

    public static boolean isValidMethod(String method) {
        return getMethod(method) != null;
    }

}
