package utils;

import org.openqa.selenium.interactions.Encodable;

import javax.sound.sampled.AudioFormat;
import java.beans.Encoder;
import java.io.*;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.Properties;

public class ReadProperties {
    public static Properties prop;

    static {
        File file = new File("properties\\testData.properties");
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
