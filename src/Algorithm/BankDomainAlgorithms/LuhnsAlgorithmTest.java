package Algorithm.BankDomainAlgorithms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LuhnsAlgorithmTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final InputStream sysInBackup = System.in; // backup System.in to restore it later
    private final ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());


    @Before
    public void setUpStream(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        System.setIn(in);
    }

    @After
    public void restoreStream(){
        System.setOut(originalOut);
        System.setErr(originalErr);
        System.setIn(sysInBackup);
    }

    @Test
    public void testValidNumber(){
        LuhnsAlgorithm createObject = new LuhnsAlgorithm();
        Assert.assertTrue(createObject.checkValidCreditCard("49927398716"));
    }

    @Test
    public void testInvalidNumber(){
        LuhnsAlgorithm createObject = new LuhnsAlgorithm();
        Assert.assertFalse(createObject.checkValidCreditCard("12345678"));
    }

    @Test
    public void testPlaceHolders(){
        LuhnsAlgorithm createObject = new LuhnsAlgorithm();
        Assert.assertFalse(createObject.checkValidCreditCard("?£"));
    }

    @Test
    public void testForIfConditionOutput(){
        LuhnsAlgorithm createObject = new LuhnsAlgorithm();
        createObject.checkValidCreditCard("49927398716");
            Assert.assertEquals("This is a valid Card Number", outContent.toString());

    }

}