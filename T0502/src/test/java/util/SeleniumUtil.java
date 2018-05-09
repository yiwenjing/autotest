package util;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

/**
 * log4j在项目中如何运用？
 * 解决方案：在每一个类中，都去加上日志信息，复用性不强  否了
 * 新的解决;对selenium里面常用的API进行二次封装 log exception
 */
public class SeleniumUtil {
    //类属性
    private  static Logger logger=Logger.getLogger(SeleniumUtil.class);
    //实例属性
    public  WebDriver driver=null;

    //获取webdriver,加载驱动
    public WebDriver getDriver(String driverType){
        if(driverType.equals("chrome")){
            driver=new ChromeDriver();
            logger.info("启动chromedriver");
        }else if(driverType.equals("firefox")){
            driver=new FirefoxDriver();
            logger.info("启动firefoxdriver");
        }else{
            logger.error("不能识别浏览器类型");
        }
        return  driver;
    }
    //识别一个元素
      WebElement element=null;
      public WebElement findElement(By by){

        try {
            element=driver.findElement(by);
            logger.info("找到元素为："+getLocatorByElement(element,">"));
            return  element;
        }catch(NoSuchElementException e){
            e.printStackTrace();
            logger.error("元素未找到");
            return  null;
        }

    }


    //打开网址
    public void url(String url){
        driver.get(url);
        logger.info("打开的网址是:"+url);
    }

    //返回元素的定位值

    public  String getLocatorByElement(WebElement element,String exceptText){
        String text=element.toString();
        String except=null;
        try{
           except=text.substring(text.indexOf(exceptText)+1,text.length()-1);
           // logger.info("返回元素的定位值是："+except);

        }catch (Exception e){
            e.printStackTrace();
            logger.error("元素找不到定位值:"+exceptText);
        }
        return except;
    }

    //识别一组元素
    public java.util.List<WebElement> findElements(By by){
     /*   List<WebElement> list=null;
        try {
          list=driver.findElements(by);
          logger.info("找到一组元素");
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("找不到元素");
        }
        return list;*/
        logger.info("返回一组元素");
        return  driver.findElements(by);
    }

    //清空元素上的内容
    public  void  clear(By by){
       WebElement webElement=findElement(by);
        webElement.clear();
        logger.info("清空元素:"+getLocatorByElement(webElement,">")+"的内容");
    }

    //文本框中输入内容
    public  void  sendKeys(By by,String text){
      /*  try {
            element.sendKeys(text);
            logger.info("输入内容成功");
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            logger.error("输入内容不成功");
        }*/
        WebElement webElement=findElement(by);
        clear(by);
        webElement.sendKeys(text);
        logger.info("在元素"+getLocatorByElement(webElement,">")+"上输入内容："+text);
    }
    //对元素做点击操作
    public void  click(By by){
       /* Actions action=new Actions(driver);//实例化鼠标
      try {
          action.click((WebElement) element).perform();
          logger.info("鼠标执行单击操作");
      }catch (StaleElementReferenceException e){
          e.printStackTrace();
          logger.error(" 找不到单击元素");
      }*/
        WebElement webElement=findElement(by);
        webElement.click();
        logger.info("对元素"+getLocatorByElement(webElement,">")+"做点击操作");
    }

    //获取控件内容
    String text=null;
    public String getText(By by){
        WebElement webElement=findElement(by);
       text=webElement.getText();
        logger.info("页面元素获取的内容是："+text);
        return text;
    }

    // 根据顶部title判断当前页面是否是预期页面 assertPage
    public  void  assertPage(String yutitle){
        String  title=null;
        title=driver.getTitle();
        /*if(title.equals(yutitle)){
            logger.info("当前页面是预期页面");
        }else{
            logger.error("当前页面不是预期页面");
        }*/
        try{
            Assert.assertEquals(title,yutitle);
        }catch (AssertionError e){
            logger.error("预期的页面是：["+yutitle+"],当前的页面是：["+title+"]");
            Assert.fail("预期的页面是：["+yutitle+"],当前的页面是：["+title+"]");
        }
        logger.info("找到了对应title,当前页面正确：["+title+"]");

    }
    //校验元素是否存在 isExist
    public boolean  isExist(By by){
   try {
       driver.findElements(by);
       return  true;

   }catch (NoSuchElementException e){
       e.printStackTrace();
       logger.info(by.toString()+"元素不存在");
   }
        return  false;
    }


    //校验文本是否与预期一致 assertForText
    public  void  assertForText(String text,String yutext) {
        try {
         Assert.assertEquals(text,yutext);
        }catch (AssertionError e){
         logger.error("期望文字是：["+yutext+"],实际文字是：["+text+"]");
            Assert.fail("期望文字是：["+yutext+"],实际文字是：["+text+"]");
        }
        logger.info("找到了期望文字：["+yutext+"]");
    }
}
