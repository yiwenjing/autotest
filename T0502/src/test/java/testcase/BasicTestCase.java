package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.LogConfiguration;
import util.SeleniumUtil;

/**
 * Created by suas on 2018/5/7.
 */
public class BasicTestCase {
    public WebDriver driver=null;
    SeleniumUtil seleniumUtil=null;
    @BeforeMethod
    public  void initTests(){
        seleniumUtil=new SeleniumUtil();
        LogConfiguration.initLog();
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        driver=seleniumUtil.getDriver("chrome");
        seleniumUtil.url("http://www.jd.com");

    }

    @AfterMethod
    public  void  cleanTest(){
        driver.quit();
    }
}
