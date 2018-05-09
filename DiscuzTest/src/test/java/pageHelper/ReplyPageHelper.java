package pageHelper;

import page.ReplyPage;
import util.SeleniumUtil;

/**
 * Created by suas on 2018/5/7.
 */
public class ReplyPageHelper {
    //点击默认板块
    public  static  void clickmoren(SeleniumUtil seleniumUtil){
        seleniumUtil.click(ReplyPage.LINK_MOREN);
    }
    //找到一篇帖子，点击进入
    public  static  void  clicktiezi(SeleniumUtil seleniumUtil){
        seleniumUtil.click(ReplyPage.LINK_TIEZI);
    }

    //在文本框输入回复内容
    public  static  void  inputreplycontent(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.sendKeys(ReplyPage.LINK_REPLY_CONTENT,text);
    }
    //点击回复提交按钮
    public  static  void  clickreplysubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(ReplyPage.LINK_REPLY_SUBMIT);
    }
    //重构方法
    public  static  void  reply(SeleniumUtil seleniumUtil,String  text) throws InterruptedException {
        Thread.sleep(3000);
        //clickmoren(seleniumUtil);
        //clicktiezi(seleniumUtil);

        inputreplycontent(seleniumUtil,text);
        clickreplysubmit(seleniumUtil);
    }
}
