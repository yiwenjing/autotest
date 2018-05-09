package page;

import org.openqa.selenium.By;

/**
 * Created by suas on 2018/5/7.
 */
public class LoginPage {

    //找到用户名输入框
    public static  final By LINK_USERNAME= By.id("ls_username");
    //找到密码输入框
    public  static  final By LINK_PWD=By.id("ls_password");
    //找到登录按钮
    public static  final  By LINK_SUBMIT_BUT=By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");
}
