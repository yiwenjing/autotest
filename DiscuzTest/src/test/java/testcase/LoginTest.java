package testcase;

import org.testng.annotations.Test;
import pageHelper.LoginOutPageHelper;
import pageHelper.LoginPageHelper;
import pageHelper.PostPageHelper;
import pageHelper.ReplyPageHelper;

/**
 * Created by suas on 2018/5/7.
 */
public class LoginTest extends  BasicTestCase {
    @Test
    public   void  login() throws InterruptedException {
        LoginPageHelper.login(seleniumUtil,"admin","123456");
        PostPageHelper.post(seleniumUtil,"早早上好","good morning");
        ReplyPageHelper.reply(seleniumUtil,"早上好早上好");
        LoginOutPageHelper.loginout(seleniumUtil);
        Thread.sleep(3000);
    }


}
