package page;

import org.openqa.selenium.By;

/**
 * Created by suas on 2018/5/8.
 */
public class DeletePage {
    //找到默认板块
    public static final  By LINK_MOREN= By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    //找到一篇帖子
    public static final By LINK_TIEZI=By.xpath("/html/body/div[7]/div[4]/div/div/div[4]/div[2]/form/table/tbody[2]/tr/th/a[2]");
    //找到删除主题链接
    public  static  final  By LINK_DELETE=By.xpath("/html/body/div[7]/div[4]/div[3]/a[1]");
    //找到确定按钮
    public  static  final  By LINK_ACCEPT=By.xpath("//*[@id=\"modsubmit\"]");

}
