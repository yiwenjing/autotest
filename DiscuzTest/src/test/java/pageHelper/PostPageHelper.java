package pageHelper;

import page.PostPage;
import util.SeleniumUtil;

/**
 * Created by suas on 2018/5/7.
 */
public class PostPageHelper {
    //点击默认板块
    public  static  void clickmoren(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PostPage.LINK_MOREN);
    }
    //点击新版块
    public  static  void  clicknewmodel(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PostPage.LINK_NEW_MODEL);
    }
    //输入标题
    public static void inputtitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.sendKeys(PostPage.LINK_TITLE,title);
    }
    //输入内容
    public  static  void  inputcontent(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.sendKeys(PostPage.LINK_CONTENT,content);
    }
    //点击发表帖子
    public static void  clickpostbut(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PostPage.LINK_POST_BUT);
    }
    //重构方法
    public  static  void post(SeleniumUtil seleniumUtil,String title,String content) throws InterruptedException {
        Thread.sleep(3000);
        //clickmoren(seleniumUtil);
        clicknewmodel(seleniumUtil);
        inputtitle(seleniumUtil,title);
        inputcontent(seleniumUtil,content);
        clickpostbut(seleniumUtil);
    }
}
