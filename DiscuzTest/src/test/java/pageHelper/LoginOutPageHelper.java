package pageHelper;

import page.LoginOutPage;
import util.SeleniumUtil;

/**
 * Created by suas on 2018/5/8.
 */
public class LoginOutPageHelper {
    //点击退出链接
    public  static  void  loginout(SeleniumUtil seleniumUtil) throws InterruptedException {
        Thread.sleep(3000);
        seleniumUtil.click(LoginOutPage.LINK_LOGINOUT);
    }
}
