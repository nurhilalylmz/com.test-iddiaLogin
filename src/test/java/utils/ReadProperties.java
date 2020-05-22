package utils;

import java.io.*;
import java.util.Properties;

public class ReadProperties {
    public static Properties prop;

    static {
        File file = new File("properties\\testData.properties");
        FileInputStream fileInput = null;
        try {
            prop = new Properties();
            fileInput = new FileInputStream(file);
            prop.load(fileInput);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
