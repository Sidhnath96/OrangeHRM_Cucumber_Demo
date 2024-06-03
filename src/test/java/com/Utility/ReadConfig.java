package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    File configurationfilepath;    //object of File will store the property file path
    FileInputStream configfile;     // for getting / reading property file
    Properties pro;                // to load the property file

    public ReadConfig() throws IOException {
        configurationfilepath = new File("config.properties");
        configfile = new FileInputStream(configurationfilepath);
        pro = new Properties();
        pro.load(configfile);
    }

    // created the methods to read the entries from property file and use it further

    public String getBrowser()
    {
        String browsername=pro.getProperty("browserName");
        return browsername;

    }
}
