package pageHelper;

import org.openqa.selenium.WebDriver;
import page.FindTieziPage;
import util.SeleniumUtil;

/**
 * Created by suas on 2018/5/8.
 */
public class FindTieziPageHelper {
    //输入搜索帖子的内容
    public  static  void  inputfindcontent(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.sendKeys(FindTieziPage.LINK_FIND_INPUT,content);
    }
    //点击搜索按钮
    public  static  void  clickfinfbut(SeleniumUtil seleniumUtil){
        seleniumUtil.click(FindTieziPage.LINK_FIND_BUT);
    }
    //进入搜索的帖子
    public static  void  clicktiezi(SeleniumUtil seleniumUtil){
        seleniumUtil.click(FindTieziPage.LINK_FINF_TIEZI);
    }

    //重构方法
    public  static  void findtiezi(SeleniumUtil seleniumUtil, String content, WebDriver driver) throws InterruptedException {
        inputfindcontent(seleniumUtil,content);
        clickfinfbut(seleniumUtil);
        Thread.sleep(3000);
        seleniumUtil.windowshandle(driver);
        clicktiezi(seleniumUtil);
        seleniumUtil.windowshandle(driver);



    }
}
