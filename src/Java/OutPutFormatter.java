package Java;

/*Each String is left-justified with trailing whitespace through the first
characters. The leading digit of the integer is the character, and each integer that was less than
digits now has leading zeroes.*/

import java.util.Scanner;

public class OutPutFormatter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {

            String s1 = scan.next();

            int x = scan.nextInt();

            System.out.format("%-15s%03d%n", s1, x);

        }

        scan.close();

        System.out.println("================================");

    }
}
