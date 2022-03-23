package com.aiwinn.album.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomerContextHolder {

	public static final String M = "master";
	
	public static final String S = "slave";
    
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();


    public static void setCustomerType(String customerType, String cmdId, String clusterId, String type) {
        setCustomerType(customerType, cmdId, clusterId, type, 0);
    }

    public static void setCustomerType(String customerType, String cmdId, String clusterId, String type, int islog) {
        if (islog == 0) {
            log.info("--------set mysql db name: " + customerType + ", cmdId: " + cmdId + ", clusterId: " + clusterId +
                    ", " + type);
        }
        contextHolder.set(customerType);
    }
    
    public static String getCustomerType() {
        return contextHolder.get();
    }
    
    public static void clearCustomerType() {
        contextHolder.remove();
    }
}
