package pageHelper;

import org.apache.log4j.Logger;
import page.LoginPage;
import util.SeleniumUtil;

/**
 * Created by suas on 2018/5/7.
 */
public class LoginPageHelper {
  public static Logger logger=Logger.getLogger(LoginPageHelper.class);
//输入用户名
    public  static  void  inputname(SeleniumUtil seleniumUtil,String name){
        seleniumUtil.sendKeys(LoginPage.LINK_USERNAME,name);

    }

    //输入密码
    public  static  void inputpwd(SeleniumUtil seleniumUtil,String pwd){
        seleniumUtil.sendKeys(LoginPage.LINK_PWD,pwd);
    }
    //点击登录按钮
    public  static  void clicksubmitbtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(LoginPage.LINK_SUBMIT_BUT);
    }
//重构方法
    public  static  void  login(SeleniumUtil seleniumUtil,String name,String pwd) throws InterruptedException {
        Thread.sleep(3000);
        inputname(seleniumUtil,name);
        inputpwd(seleniumUtil,pwd);
        clicksubmitbtn(seleniumUtil);
    }
}
