package page;

import org.openqa.selenium.By;

/**
 * Created by suas on 2018/5/8.
 */
public class LunTanPage {
    //找到管理中心链接
    public  static   final  By LINK_GUANLI= By.xpath("/html/body/div[6]/div/div[1]/div/p[1]/a[6]");
    //找到密码输入框
    public  static  final  By LINK_PWD=By.xpath("/html/body/table[1]/tbody/tr/td[2]/form/p[4]/input");
    //找到提交按钮
    public  static  final  By LINK_SUBMIT=By.xpath("/html/body/table[1]/tbody/tr/td[2]/form/p[9]/input");
    //找到论坛链接
    public  static  final  By LINK_LUNTAN=By.xpath("//*[@id=\"header_forum\"]");
}
