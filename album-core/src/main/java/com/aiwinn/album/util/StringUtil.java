package com.aiwinn.album.util;

public class StringUtil {

    public static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
}
