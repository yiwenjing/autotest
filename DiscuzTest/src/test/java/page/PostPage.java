package page;

import org.openqa.selenium.By;

/**
 * Created by suas on 2018/5/7.
 */
public class PostPage {

    //找到默认板块
    public static final By LINK_MOREN= By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    //找到新版块
    public  static final  By LINK_NEW_MODEL=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[2]/td[2]/h2/a");
    //找到标题框
    public  static  final By LINK_TITLE=By.xpath("//*[@id=\"subject\"]");
    //找到内容框
    public static final By LINK_CONTENT=By.xpath("//*[@id=\"fastpostmessage\"]");
    //找到发帖子按钮
    public static final By LINK_POST_BUT=By.xpath("//*[@id=\"fastpostsubmit\"]/strong");
}
