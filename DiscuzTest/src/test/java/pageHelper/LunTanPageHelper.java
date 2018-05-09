package pageHelper;

import org.openqa.selenium.WebDriver;
import page.LunTanPage;
import util.SeleniumUtil;

/**
 * Created by suas on 2018/5/8.
 */
public class LunTanPageHelper {
    //点击管理中心链接
    public  static  void  clickguanli(SeleniumUtil seleniumUtil){
        seleniumUtil.click(LunTanPage.LINK_GUANLI);
    }
    //在密码框输入密码
    public  static  void  inputpwd(SeleniumUtil seleniumUtil,String pwd){
        seleniumUtil.sendKeys(LunTanPage.LINK_PWD,pwd);
    }
    //点击提交按钮
    public  static  void  clicksubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(LunTanPage.LINK_SUBMIT);
    }
    //点击论坛链接
    public  static  void  clickluntan(SeleniumUtil seleniumUtil){
        seleniumUtil.click(LunTanPage.LINK_LUNTAN);
    }
    //重构方法
    public  static  void  luntan(SeleniumUtil seleniumUtil, WebDriver driver,String pwd) throws InterruptedException {
        Thread.sleep(3000);
        clickguanli(seleniumUtil);
       seleniumUtil.windowshandle(driver);
        inputpwd(seleniumUtil,pwd);
        clicksubmit(seleniumUtil);
        clickluntan(seleniumUtil);
        Thread.sleep(3000);
    }

}
