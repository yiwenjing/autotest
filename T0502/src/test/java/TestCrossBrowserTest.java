import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by suas on 2018/5/2.
 */
public class TestCrossBrowserTest {



    @Test
    @Parameters("Browser")
    public void startBrowser(String browser){
        if(browser.equalsIgnoreCase("FireFox")){
           System.setProperty("webdriver.gecko.driver","D:\\firefox&driver\\geckodriver.exe");
            WebDriver driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://www.baidu.com");
        }
        else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
            WebDriver driver1=new ChromeDriver();
            driver1.manage().window().maximize();
            driver1.get("https://www.baidu.com");
        }
    }


}