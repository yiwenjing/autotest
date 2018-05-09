package testcase;

import org.testng.annotations.Test;
import pageHelper.FindTieziPageHelper;
import pageHelper.LoginOutPageHelper;
import pageHelper.LoginPageHelper;

/**
 * Created by suas on 2018/5/8.
 */
public class Discuz_3Test extends  BasicTestCase{
    @Test
   public  void  tiezi() throws InterruptedException {
        LoginPageHelper.login(seleniumUtil,"yiwenjing","123456");
        FindTieziPageHelper.findtiezi(seleniumUtil,"haotest",driver);
        LoginOutPageHelper.loginout(seleniumUtil);
    }
}
