package Algorithm;

import jdk.jfr.Description;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    @Description("Check for palindrome")
    public void assertValueIsPalindrome(){
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.checkPalindrome("ABBA"));
    }
    @Test
    @Description("Check for palindrome")
    public void assertValueIsNotPalindrome(){
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.checkPalindrome("Rocket"));
    }
}