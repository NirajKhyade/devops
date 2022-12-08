package PageObject;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
    static Properties p=new Properties();
    static WebDriver driver;
    public UtilityClass(WebDriver driver) {
    }
    public static String getData(String key) throws IOException {
        FileInputStream file=new FileInputStream("/home/nirk/BDD_Amazon_Assignment/src/test/java/testData/Data.properties");
        p.load(file);
        String values=p.getProperty(key);
        return values;
    }

}
