package InputOutput;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
* //s vs //s+ is there are more than one blank space between strings then //s+ will ignore those blanks spaces
* wereas //s will not ignore only the first blank space it encounters and print the second one
*
* java.util.Scanner class is a simple text scanner which can parse primitive types and strings. It internally uses regular expressions to read different types.
Java.io.BufferedReader class reads text from a character-input stream, buffering characters so as to provide for the efficient reading of sequence of characters
Following are differences between above two.

BufferedReader is synchronous while Scanner is not. BufferedReader should be used if we are working with multiple threads.
BufferedReader has significantly larger buffer memory than Scanner.
The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer), but it’s more than enough.
BufferedReader is a bit faster as compared to scanner because scanner does parsing of input data and BufferedReader simply reads sequence of characters.*/


/*System.in is an input stream that needs to be converted to
character set therefor we use wrapper class InputStreamReader
which converts the byte input to character input using a
character set  */

public class ScannerVsBufferReader {

    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        String[] srtParse = str.split("\\s");
        String[] srtParse1 = str.split("\\s+");

        for(String ch : srtParse )
        System.out.println("The first value is :" + ch);

        for(String ch : srtParse1 )
            System.out.println("The first value is :" + ch);
        // using InputStreamReader
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name: ");

            String name = reader.readLine();
            System.out.println("Your name is: " + name);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your nationality: ");
        String nationality = scanner.nextLine();
        System.out.println("Your nationality is: " + nationality);

        // using Console
        Console console = System.console();
        if (console == null) {
            System.out.println("No console: not in interactive mode!");
            System.exit(0);
        }

        System.out.print("Enter your username: ");
        String username = console.readLine();

        System.out.print("Enter your password: ");
        char[] password = console.readPassword();

        System.out.println("Thank you!");
        System.out.println("Your username is: " + username);
        System.out.println("Your password is: " + String.valueOf(password));

        // using Console with formatted prompt
        String job = console.readLine("Enter your job: ");

        String passport = console.readLine("Enter your %d (th) passport number: ", 2);

        System.out.println("Your job is: " + job);
        System.out.println("Your passport number is: " + passport);
    }
}
