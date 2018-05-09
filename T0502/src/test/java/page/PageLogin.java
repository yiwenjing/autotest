package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by suas on 2018/5/7.
 */
public class PageLogin {
   WebDriver driver=new ChromeDriver();

    //进入登录页面
    public static  final By LINK_TITLE=By.className("link-login");
    //点击账户登录按钮
    public static  final By LINK_LOGIN_TEXT=By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/a");
    //在用户名文本框提交内容
    public static  final  By LINK_LOGIN_USER=By.id("loginname");
    //在密码文本框提交内容
    public static  final  By LINK_LOGIN_PSW=By.id("nloginpwd");
    //点击登录按钮
    public static  final By LINK_LOGIN_SUBMIT=By.id("loginsubmit");
}
