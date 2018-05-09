package util;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by suas on 2018/5/8.
 */
public class BrowserEngine {
    public static String  browserName;
    public   static String serverURL;
    public WebDriver driver;
    public   static String initConfigData() throws IOException {
        Properties p=new Properties();
        InputStream ips=new FileInputStream(".\\config.properties");
        p.load(ips);

        browserName=p.getProperty("browserName");
        serverURL=p.getProperty("URL");

        return null;
    }
    static {
        try{
            BrowserEngine.initConfigData();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(BrowserEngine.browserName);
    }

}
