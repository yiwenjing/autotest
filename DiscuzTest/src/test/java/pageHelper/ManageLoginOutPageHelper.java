package pageHelper;

import page.ManageLoginOutPage;
import util.SeleniumUtil;

/**
 * Created by suas on 2018/5/8.
 */
public class ManageLoginOutPageHelper {
    //退出管理页面
    public  static  void  clickloginouty(SeleniumUtil seleniumUtil){
        seleniumUtil.click(ManageLoginOutPage.LINK_LOGINOUT_Y);
    }
    //退出登录
    public  static  void  clickloginout(SeleniumUtil seleniumUtil){
        seleniumUtil.click(ManageLoginOutPage.LINK_LOGINOUT);
    }
    //重构方法
    public  static  void  mloginout(SeleniumUtil seleniumUtil){
        clickloginout(seleniumUtil);
        clickloginouty(seleniumUtil);
    }
}
