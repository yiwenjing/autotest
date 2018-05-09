package util;

import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by suas on 2018/5/7.
 */
public class LogConfiguration {
    public  static  void  initLog(){
        //指定日期的生成格式
        SimpleDateFormat dataFormat=new SimpleDateFormat("yyyy_MM_dd  HH_mm_ss");
        //获取日期
        String data=dataFormat.format(new Date());
        //声明日志文件存储路径以及文件名，格式
        final String logFilePath="./result/report"+data+".log";
        Properties prop=new Properties();
        //配置日志输出的格式
        prop.setProperty("log4j.rootLogger","info,toConsole,toFile");
        prop.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        prop.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        prop.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        prop.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        prop.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        prop.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy-MM--dd HH:mm:ss}] [%p] %m%n");
        prop.setProperty("log4j.appender.toFile.file",logFilePath);
        //使配置生效
        PropertyConfigurator.configure(prop);





    }
}
