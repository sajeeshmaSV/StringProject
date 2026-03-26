package com.hibernate.crud.config;

import java.util.Properties;

public class PropertiesConfig {

    private static final Properties PROPERTIES=new Properties();
    private static final PropertiesConfig instance=new PropertiesConfig();

    private PropertiesConfig()
    {

    }
    public static PropertiesConfig getInstance(){
        return instance;
    }
    public static String getProperties(String key){
        return PROPERTIES.getProperty(key);
    }
}