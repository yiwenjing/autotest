import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by suas on 2018/5/2.
 */
public class AbsTest {

@BeforeSuite
public void beforesuite(){

}
    @AfterSuite
    public void aftersuite(){


    }

        @BeforeTest
        public void beforetest(){

        }
    @AfterTest
    public void aftertest(){

    }
        @BeforeClass
        public void beforeclass(){

        }
    @AfterClass
    public void afterclass(){

    }


    Abs ab=new Abs();
    @BeforeMethod
    public void setUp() throws Exception {

    }
    @AfterMethod
    public void tearDown() throws Exception {

    }
    @Test
    public void testAbs() throws Exception {

        Assert.assertEquals(ab.abs(-1),1,"-1的绝对值是1");
        System.out.println("李静雅1");
    }
    @Test
    public void testAbs1() throws Exception {

        Assert.assertEquals(ab.abs(1),1,"1的绝对值是1");
        System.out.println("李静雅2");
    }
    @Test
    public void testAbs2() throws Exception {
        Assert.assertEquals(ab.abs(0),0,"0的绝对值是0");
        System.out.println("李静雅3");
    }






}