package utils.properties;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Properties;

public class ReadProperties {
    public static Properties prop;

    static {
        File file = new File("src\\test\\java\\utils\\properties\\testData.properties");
        FileInputStream fileInput = null;
        try {
            prop = new Properties();
            fileInput = (new FileInputStream(file));
            prop.load(new InputStreamReader(fileInput, Charset.forName("ISO-8859-1")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
