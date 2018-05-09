import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.LogConfiguration;
import util.SeleniumUtil;

/**
 * Created by suas on 2018/5/4.
 */
public class YiTest {
    public static void main(String[] args) {
        SeleniumUtil seleniumUtil=new SeleniumUtil();
        LogConfiguration.initLog();
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        seleniumUtil.getDriver("chrome");
        seleniumUtil.url("http://www.baidu.com");
        WebElement element=seleniumUtil.findElement(By.linkText("新闻"));
        seleniumUtil.getLocatorByElement(element,">");
        seleniumUtil.click(By.linkText("新闻"));


    }
}
