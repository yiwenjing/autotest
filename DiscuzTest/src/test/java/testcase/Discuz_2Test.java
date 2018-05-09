package testcase;

import org.testng.annotations.Test;
import pageHelper.*;

/**
 * Created by suas on 2018/5/8.
 */
public class Discuz_2Test extends  BasicTestCase {
    @Test
    public void delete() throws InterruptedException {
       // LoginPageHelper.login(seleniumUtil,"admin","123456");
        //DeletePageHelper.delete(seleniumUtil);
        //LunTanPageHelper.luntan(seleniumUtil,driver,"123456");
        //NewModelPageHelper.newmodel(seleniumUtil,"ywj",driver,"main");
       // ManageLoginOutPageHelper.mloginout(seleniumUtil);
        LoginPageHelper.login(seleniumUtil,"yiwenjing","123456");
        PostPageHelper.post(seleniumUtil,"aaaaa","aaaaaaaaaaaaaaaaaaaa");
        ReplyPageHelper.reply(seleniumUtil,"bbbbbbbbbbbbbbbbbbbbb");
    }
}
