import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class simpleTest {

    @Test
    public void calc(){
        Assert.assertEquals(2+2, 4, "Sth went very wrong");
        System.out.println(2+2);
    }

    @Test
    public void another(){
        Assert.assertEquals(5+5, 10);
        System.out.println(5+5);
    }

    @Test
    public void shouldPass(){
        Assert.assertTrue(true);
    }

    @Test
    public void shouldFail(){
        Assert.assertTrue(false);
    }



}
