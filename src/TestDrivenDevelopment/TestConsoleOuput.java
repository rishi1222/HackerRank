package TestDrivenDevelopment;

/*
* How do I test a method that writes to console ?
*
* use ByteArrayOutputStream to catch the output written by the function/method
*
* ByteArrayOutputStream out = new ByteArrayOutputStream();
* HelloWorld.print(new PrintStream(out));
* String s = out.toString();
* Assert.assertEquals("Hello",s);
* The old method (of JUnit 3) was to mark the test-classes by extending junit.framework.TestCase. That inherited junit.framework.Assert itself and your test class gained the ability to call the assert methods this way.
Since version 4 of JUnit, the framework uses Annotations for marking tests. So you no longer need to extend TestCase. But that means, the assert methods aren't available. But you can make a static import of the new Assert class. That's why all the assert methods in the new class are static methods. So you can import it this way:*/

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class TestConsoleOuput {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        /*The below statements are the key. It changes the value
        of the supposedly "final" System.out attribute to be the
        supplied PrintStream value*/
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void out() {
        System.out.print("hello");
        assertEquals("hello", outContent.toString());
    }

    @Test
    public void err() {
        System.err.print("hello again");
        assertEquals("hello again", errContent.toString());

    }
}
