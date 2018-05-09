package page;

import org.openqa.selenium.By;

/**
 * Created by suas on 2018/5/8.
 */
public class ManageLoginOutPage {
    //找到退出链接，退出管理页面
    public  static  final  By LINK_LOGINOUT_Y= By.xpath("//*[@id=\"frameuinfo\"]/p[1]/a");
    //找到退出链接，退出登录
    public  static  final By LINK_LOGINOUT=By.xpath("/html/body/div[6]/div/div[1]/div/p[1]/a[7]");
}
