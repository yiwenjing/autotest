package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by suas on 2018/5/7.
 */
public class ReplyPage {
    WebDriver driver=new ChromeDriver();
    //找到默认板块
    public  static  final  By LINK_MOREN= By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    //找到一篇帖子
    public  static  final  By LINK_TIEZI= By.xpath("/html/body/div[7]/div[4]/div/div/div[4]/div[2]/form/table/tbody[2]/tr/th/a[2]");

    //找到回复文本框
    public  static  final By LINK_REPLY_CONTENT=By.xpath("//*[@id=\"fastpostmessage\"]");
    //找到提交回复的按钮
    public  static  final By LINK_REPLY_SUBMIT=By.xpath("//*[@id=\"fastpostsubmit\"]");
}
