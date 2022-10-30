package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
    //create object of properties file
    Properties properties;

    //store path of config file in path variable
    String path = "Configration/config.properties";

    public readConfig(){
        try {
        properties = new Properties();

            FileInputStream fileinput = new FileInputStream(path);
            properties.load(fileinput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String geturl(){
       String value = properties.getProperty("baseurl");

        if (value!=null)
            return value;
        else
            throw new RuntimeException("url not specified");
    }

    public String getbrowser(){
        String value = properties.getProperty("browser");

        if (value!=null)
            return value;
        else
            throw new RuntimeException("browser not specified");
    }
}
