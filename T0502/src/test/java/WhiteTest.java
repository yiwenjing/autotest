import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Created by suas on 2018/5/2.
 */
public class WhiteTest {

    @AfterMethod
    public  void tearDown() throws  Exception{

    }
    @Test
    public void testWhiteTest() throws Exception {
        Assert.assertEquals(White.whiteTest(-1,0),0);

    }
    @Test
    public void testWhiteTest1() throws Exception {
        Assert.assertEquals(White.whiteTest(1,1),10);

    }
    @Test
    public void testWhiteTest2() throws Exception {
        Assert.assertEquals(White.whiteTest(1,0),101);

    }
    @Test
    public void testWhiteTest3() throws Exception {
        Assert.assertEquals(White.whiteTest(1,2),20);

    }
}