package pageHelper;

import page.DeletePage;
import util.SeleniumUtil;

/**
 * Created by suas on 2018/5/8.
 */
public class DeletePageHelper {
    //点击默认板块
    public  static  void clickmoren(SeleniumUtil seleniumUtil){
        seleniumUtil.click(DeletePage.LINK_MOREN);
    }
    //找到一篇帖子，点击进入
    public  static  void  clicktiezi(SeleniumUtil seleniumUtil){
        seleniumUtil.click(DeletePage.LINK_TIEZI);
    }
    //点击删除主题链接
    public  static  void  clickdelete(SeleniumUtil seleniumUtil){
        seleniumUtil.click(DeletePage.LINK_DELETE);
    }
    //点击确定按钮
    public  static  void  alertaccept(SeleniumUtil seleniumUtil)  {
        seleniumUtil.click(DeletePage.LINK_ACCEPT);}
    //重构方法
    public  static  void  delete(SeleniumUtil seleniumUtil) throws InterruptedException {
        Thread.sleep(3000);
        clickmoren(seleniumUtil);
        clicktiezi(seleniumUtil);
        clickdelete(seleniumUtil);
        Thread.sleep(3000);
        alertaccept(seleniumUtil);
    }
}
