package com.aiwinn.album.manager;

import java.util.HashMap;
import java.util.Map;

public class MapAppSecretManager {
	
    private static Map<String, String> appKeySecretMap = new HashMap<>();

    static {

    }

    public static String getSecret(String appKey) {
        return appKeySecretMap.get(appKey);
    }

    public static boolean isValidAppKey(String appKey) {
        return getSecret(appKey) != null;
    }


}
