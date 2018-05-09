import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.apache.log4j.Logger;
import util.LogConfiguration;

import java.io.*;
import java.util.List;
 /**
 * Created by suas on 2018/5/3.
 */
public class TestExcelDDT {
    private  static WritableWorkbook wb=null;
    private static Logger logger=Logger.getLogger(TestExcelDDT.class);
     public  static  String[][] readExcel(String path,String  sheetName){
              InputStream in=null;
              String[][] data=null;
         try{
             in=new FileInputStream(path);
             logger.info("成功获取了输入流");
            Workbook workbook= Workbook.getWorkbook(in);
            Sheet sheet= workbook.getSheet(sheetName);
             logger.info("成功获取了表单");
             int rows=sheet.getRows();
             int columns=sheet.getColumns();
             logger.info("获取到的行是:"+rows);
             logger.info("获取到的列是:"+columns);
            data=new String[rows][columns];

             for(int i=0;i<rows;i++){
                 for (int j=0;j<columns;j++){
                     data[i][j]=sheet.getCell(j,i).getContents();
                 }
             }
         }catch (Exception e){
             e.printStackTrace();
         }
            return data;
}

    public static  void writeExcel(List<String> list,String path){
        File file=new File("D:\\T0502\\asd.xls");
        OutputStream out=null;
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");


        if(file.isFile()&& file.exists()){
            file.delete();
        }
        try {
            out=new FileOutputStream(file);
            wb=Workbook.createWorkbook(out);
            WritableSheet sheet=wb.createSheet("account",0);
            for(int i=0;i<list.size();i++){
                sheet.addCell(new Label(0,i,list.get(i)));
            }
            wb.write();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(wb!=null){
                try {
                    wb.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }


    public  static  void  main(String[]args){
       LogConfiguration.initLog();
        String[][] myData=readExcel("./data.xls","data");
        System.out.println("######################");
       /* System.out.print(myData[0][0]+"\t");
        System.out.println(myData[0][1]);
        System.out.print(myData[1][0]+"\t");
        System.out.println(myData[1][1]);*/
        for(int i=0;i<myData.length;i++){
            String[] item=myData[i];
            for(int j=0;j<item.length;j++){
                System.out.print(item[j]+"\t");
            }
            System.out.println();
        }
    }
}
