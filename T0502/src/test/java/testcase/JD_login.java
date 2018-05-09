package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
/**
 * Created by suas on 2018/5/7.
 */
public class JD_login extends BasicTestCase {
   /* public WebDriver driver=null;
    SeleniumUtil seleniumUtil=null;
    @BeforeMethod
    public  void setUp(){
        seleniumUtil=new SeleniumUtil();
        LogConfiguration.initLog();
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        driver=seleniumUtil.getDriver("chrome");
        seleniumUtil.url("http://www.jd.com");

}*/
    @Test
    public  void login(){
        HelperLoginPage.login(seleniumUtil,"123","123");

        /*seleniumUtil.url("http://www.jd.com");
        seleniumUtil.click(By.className("link-login"));
        seleniumUtil.click(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/a"));
        seleniumUtil.sendKeys(By.id("loginname"),"test");
        seleniumUtil.sendKeys(By.id("nloginpwd"),"test123");
        seleniumUtil.click(By.id("loginsubmit"));*/

    }

   /* @AfterMethod
    public  void  tearDown(){
        driver.quit();
    }*/


}
