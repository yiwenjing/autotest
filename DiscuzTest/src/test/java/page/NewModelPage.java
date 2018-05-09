package page;

import org.openqa.selenium.By;

/**
 * Created by suas on 2018/5/8.
 */
public class NewModelPage {

    //找到添加新版块链接
    public  static  final By LINK_NEW= By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr[2]/td[2]/div/a");
    //找到新版块名称
    public  static  final  By LINK_NEW_NAME= By.className("newforum[1][]");
    //找到提交按钮
    public  static  final  By LINK_SUBMIT= By.xpath("//*[@id=\"submit_editsubmit\"]");
}
