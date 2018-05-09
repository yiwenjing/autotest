package pageHelper;

import org.apache.log4j.Logger;
import page.PageLogin;
import util.SeleniumUtil;


/**
 * Created by suas on 2018/5/7.
 */
public class HelperLoginPage {
    public static Logger logger= Logger.getLogger(HelperLoginPage.class);
    //点击登录,进入登录页面
    public  static  void  clickLoginTitle(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LINK_TITLE);
    }
    //点击账户登录
    public static  void clickLoginText(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LINK_LOGIN_TEXT);
    }
    //输入用户名
    public  static  void  inputLoginName(SeleniumUtil seleniumUtil,String name){
        seleniumUtil.sendKeys(PageLogin.LINK_LOGIN_USER,name);
    }

    //输入密码
    public  static  void  inputLoginPwd(SeleniumUtil seleniumUtil,String pwd){
        seleniumUtil.sendKeys(PageLogin.LINK_LOGIN_PSW,pwd);
    }

    //点击登录按钮
    public  static  void  clickLoginBut(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LINK_LOGIN_SUBMIT);
    }

    //重构方法
    public static  void  login(SeleniumUtil seleniumUtil,String name,String pwd){

        clickLoginTitle(seleniumUtil);
        clickLoginText(seleniumUtil);
        inputLoginName(seleniumUtil,name);
        inputLoginPwd(seleniumUtil,pwd);
        clickLoginBut(seleniumUtil);
    }

}
