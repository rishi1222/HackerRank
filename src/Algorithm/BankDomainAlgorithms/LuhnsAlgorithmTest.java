package Algorithm.BankDomainAlgorithms;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


public class LuhnsAlgorithmTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final InputStream sysInBackup = System.in; // backup System.in to restore it later
    private final ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());


    @BeforeEach
    public void setUpStream(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        System.setIn(in);
    }

    @AfterEach
    public void restoreStream(){
        System.setOut(originalOut);
        System.setErr(originalErr);
        System.setIn(sysInBackup);
    }

    @Test
    public void testValidNumber(){
        LuhnsAlgorithm createObject = new LuhnsAlgorithm();
        assertTrue(createObject.checkValidCreditCard("49927398716"));
    }

    @Test
    public void testInvalidNumber(){
        LuhnsAlgorithm createObject = new LuhnsAlgorithm();
        assertFalse(createObject.checkValidCreditCard("12345678"));
    }

    @Test
    public void testPlaceHolders(){
        LuhnsAlgorithm createObject = new LuhnsAlgorithm();
        assertFalse(createObject.checkValidCreditCard("?£"));
    }

    @Test
    public void testForIfConditionOutput(){
        LuhnsAlgorithm createObject = new LuhnsAlgorithm();
        createObject.checkValidCreditCard("49927398716");
            assertEquals("This is a valid Card Number", outContent.toString());

    }

}