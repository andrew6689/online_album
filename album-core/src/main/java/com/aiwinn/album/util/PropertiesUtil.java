package com.aiwinn.album.util;

import java.io.IOException;
import java.util.Properties;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class PropertiesUtil {

	public static String getProperties(String key) {
		String value = "";
	    Properties props;
		try {
			props = PropertiesLoaderUtils.loadAllProperties("system.properties");
			value = props.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}  
	    return value;
	}

}
