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

}
