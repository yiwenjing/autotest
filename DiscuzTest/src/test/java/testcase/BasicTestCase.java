package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.BrowserEngine;
import util.LogConfiguration;
import util.SeleniumUtil;

/**
 * Created by suas on 2018/5/7.
 */
public class BasicTestCase {
    public WebDriver driver=null;
    SeleniumUtil seleniumUtil=null;
    @BeforeMethod
    public  void initTests()  {
        seleniumUtil=new SeleniumUtil();
        LogConfiguration.initLog();
        driver=seleniumUtil.getDriver(BrowserEngine.browserName);
//        driver.get("http://127.0.0.1:8090/Upload/forum.php");
        seleniumUtil.url("http://127.0.0.1:8090/Upload/forum.php");

    }

    @AfterMethod
    public  void  cleanTest(){
        driver.quit();
    }

}
