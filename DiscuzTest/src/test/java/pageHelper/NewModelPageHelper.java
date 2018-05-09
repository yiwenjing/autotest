package pageHelper;

import org.openqa.selenium.WebDriver;
import page.NewModelPage;
import util.SeleniumUtil;

/**
 * Created by suas on 2018/5/8.
 */
public class NewModelPageHelper {
    //点击添加新版块链接
    public  static  void  clicknew(SeleniumUtil seleniumUtil){

        seleniumUtil.click(NewModelPage.LINK_NEW);
    }
    //给新版块输入名称
    public  static  void  inputname(SeleniumUtil seleniumUtil,String  name){
        seleniumUtil.clear(NewModelPage.LINK_NEW_NAME);
        seleniumUtil.sendKeys(NewModelPage.LINK_NEW_NAME,name);
    }
    //点击提交按钮
    public  static  void  clicksubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(NewModelPage.LINK_SUBMIT);
    }
    //重构方法
    public  static  void newmodel(SeleniumUtil seleniumUtil , String name, WebDriver driver,String id){
       seleniumUtil.frame(driver,id);
        clicknew(seleniumUtil);
        inputname(seleniumUtil,name);
        clicksubmit(seleniumUtil);
    }
}
