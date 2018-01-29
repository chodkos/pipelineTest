import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class simpleTest {

    private final static Logger LOG = Logger.getLogger(simpleTest.class.getName());

    @Test
    public void calc(){
        LOG.info("Logger msg here");
        Assert.assertEquals(2+2, 4, "Sth went very wrong");
        System.out.println(2+2);
        LOG.info("Calc test passed");
    }

    @Test
    public void another(){
        LOG.info("Inside another test");
        Assert.assertEquals(5+5, 10);
        System.out.println(5+5);
        LOG.info("Sucess");
    }

    @Test
    public void shouldPass(){
        LOG.info("Inside shouldPass test");
        Assert.assertTrue(true);
        LOG.info("Sucess");
    }

    @Test
    public void shouldFail(){
        LOG.info("Inside shouldFail test");
        LOG.info("Lorem ipsum");
        Assert.assertTrue(true);
        LOG.info("Should fail sometimes");

        try {
            PrintWriter out = new PrintWriter("screenshot/filename.txt");
            out.println("New date: " + System.currentTimeMillis());
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



}
