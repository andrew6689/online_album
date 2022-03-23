package com.aiwinn.album.util;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DruidConnectionProvider extends DruidDataSource {
	
    private static final long serialVersionUID = 1377390212442554779L;
    
    private String jdbc;
    
    public String getJdbc() {
		return jdbc;
	}

	public void setJdbc(String jdbc) {
		this.jdbc = jdbc;
	}

	@Override
    public void setUsername(String username) {
        try {
        	String publickeyUser = PropertiesUtil.getProperties(this.getJdbc() + ".publickey_user");
        	log.info("---user: " + this.getJdbc() + ", " + publickeyUser);
        	if (!StringUtil.isBlank(publickeyUser)) {
        		username = ConfigTools.decrypt(publickeyUser, username);
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.setUsername(username);
        
    }
    
    @Override
    public void setPassword(String password) {
    	try {
    		String publickeyPwd = PropertiesUtil.getProperties(this.getJdbc() + ".publickey_pwd");
        	log.info("---pwd: " + this.getJdbc() + ", " + publickeyPwd);
    		if (!StringUtil.isBlank(publickeyPwd)) {
    			password = ConfigTools.decrypt(publickeyPwd, password);
    		}
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.setPassword(password);
    }

    @Override
    public void setUrl(String url) {
    	try {
    		String publickeyUrl = PropertiesUtil.getProperties(this.getJdbc() + ".publickey_url");
        	log.info("---url: " + this.getJdbc() + ", " + publickeyUrl);
    		if (!StringUtil.isBlank(publickeyUrl)) {
    			url = ConfigTools.decrypt(publickeyUrl, url);
    		}
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.setUrl(url);
    }

}
