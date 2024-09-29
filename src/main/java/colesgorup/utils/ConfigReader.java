package colesgorup.utils;

import java.io.*;
import java.util.Properties;

public class ConfigReader {
    private static ConfigReader reader;
    private static final Properties prop = new Properties();

    private ConfigReader() throws IOException {
        File file = new File("C:\\Users\\Anand Mishra\\IdeaProjects\\colesgorup\\src\\main\\resources\\application.properties");
        InputStream is = new FileInputStream(file);
        prop.load(is);
    }

    public static ConfigReader getInstance() throws IOException {
        if (reader == null) {
            reader = new ConfigReader();
        }
        return reader;
    }

    public String getString(String key) {
       return System.getProperty(key,prop.getProperty(key));
    }
 
}
