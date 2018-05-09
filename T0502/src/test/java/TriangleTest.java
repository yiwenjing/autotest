import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by suas on 2018/5/2.
 */
public class TriangleTest {
    Triangle tr=new Triangle(1,1,1);
    Triangle tr1=new Triangle(3,4,5);
    Triangle tr2=new Triangle(2,2,3);
    Triangle tr3=new Triangle(2,1,1);
    Triangle tr4=new Triangle(0,1,1);
    @Test
    public void testIsTraingle() throws Exception {
        Assert.assertEquals(tr.isTriangle(tr),"true");
        Assert.assertEquals(tr1.isTriangle(tr1),"true");
        Assert.assertEquals(tr2.isTriangle(tr2),"true");
        Assert.assertEquals(tr3.isTriangle(tr3),"false");
        Assert.assertEquals(tr4.isTriangle(tr4),"false");

    }


    @Test
    public void testGetType() throws Exception {
        Assert.assertEquals(tr.getType(tr),"Regular");
        System.out.println("等边三角形");
    }

    @Test
    public void testGetType1() throws Exception {
        Assert.assertEquals(tr1.getType(tr1),"Scalene");
        System.out.println("三角形");
    }

    @Test
    public void testGetType2() throws Exception {
        Assert.assertEquals(tr2.getType(tr2),"Isosceles");
        System.out.println("等腰三角形");
    }

    @Test
    public void testGetType3() throws Exception {
        Assert.assertEquals(tr3.getType(tr3),"Illegal");
        System.out.println("不是三角形");
    }

    @Test
    public void testGetType4() throws Exception {
        Assert.assertEquals(tr4.getType(tr4),"Illegal");
        System.out.println("不是三角形");
    }





}