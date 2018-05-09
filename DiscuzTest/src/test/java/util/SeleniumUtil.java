package util;


import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

/**
 * Created by suas on 2018/5/7.
 */
public class SeleniumUtil {
    private static Logger logger=Logger.getLogger(SeleniumUtil.class);
    public WebDriver driver=null;
    public WebElement element=null;
    //获取驱动
    public WebDriver getDriver(String driverType){
        if(driverType.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
            driver=new ChromeDriver();
            logger.info("启动chromedriver");
        }else if(driverType.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","D:\\firefox&driver\\geckodriver.exe");
            driver=new FirefoxDriver();
            logger.info("启动firefoxdriver");
        }else{
            logger.error("不能识别浏览器类型");
        }
        return driver;
    }
    //打开网址
    public  void  url(String url){
        driver.get(url);
        logger.info("打开的网址是："+url);
    }

    //识别一个元素

    public WebElement findElement(By by){
        try{
            element=driver.findElement(by);
            logger.info("找到的元素为："+getLocatorByElement(element,">"));
            return  element;
        }catch (NoSuchElementException e){
            logger.error("元素未找到");
            return null;
        }
    }

    //识别一组元素
    public List<WebElement> findElements(By by){
        logger.info("返回一组元素");
        return driver.findElements(by);
    }

    //返回元素的定位值
    public String getLocatorByElement(WebElement element,String exceptText){
    String  text=element.toString();
        String except=null;
        try{
            except=text.substring(text.indexOf(exceptText)+1,text.length()-1);
            logger.info("返回元素的定位值是;"+except);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("元素找不到定位值："+exceptText);
        }
        return  except;
    }

    //清空元素上的内容
    public  void  clear(By by){
        element=findElement(by);
        element.clear();
        logger.info("清空元素："+getLocatorByElement(element,">")+"的内容");
    }
    //文本框中输入内容
    public  void sendKeys(By by,String text){
        element=findElement(by);
        //clear(by);
        element.sendKeys(text);
        logger.info("在元素"+getLocatorByElement(element,">")+"上输入内容："+text);
    }
    //对元素进行点击操作
    public  void  click(By by){
        element=findElement(by);
        element.click();
        logger.info("对元素:"+getLocatorByElement(element,">")+"进行点击操作");
    }
    //获取控件内容
    public  String  getText(By by){
        element=findElement(by);
        String text=element.getText();
        logger.info("页面元素获取的内容是："+text);
        return text;
    }
    //对弹窗进行确定操作
    public void  alertaccept(){
       /* element=findElement(by);
        element.click();*/
        Alert alert=driver.switchTo().alert();
        alert.accept();
        logger.info("对元素进行弹窗的确定操作");
    }
    //句柄
    public  void  windowshandle(WebDriver driver){
        Set<String> windowsHandles=driver.getWindowHandles();
        for(String handle:windowsHandles){
            driver.switchTo().window(handle);}
    }
//iframe
    public void  frame(WebDriver driver,String id){
        driver.switchTo().frame(id);
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
    }}
