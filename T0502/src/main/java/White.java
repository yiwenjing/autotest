/**
 * Created by suas on 2018/5/2.
 */
public class White {
    public  static  int whiteTest(int count,int flag){
        int temp=0;
        while(count>0){
            if(flag==0){
                temp=count+100;
                break;
            }else{
                if(flag==1){
                    temp=temp+10;
                }else{
                    temp=temp+20;
                }
            }
            count--;
        }
        return temp;
    }
}
