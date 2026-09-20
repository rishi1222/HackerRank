package Algorithm.BankDomainAlgorithms;

import java.util.Scanner;

public class LuhnsAlgorithm {

    public boolean checkValidCreditCard(String cardNumber){

        char[] splitCardNumber = cardNumber.toCharArray();
        boolean value;
        int sum = 0;
        int number = 0;
        int j = splitCardNumber.length-2;
        for(int i=splitCardNumber.length-1; i >=0 ;--i ) {

            if (j >= 0) {
                number = Character.getNumericValue(splitCardNumber[j]);
                number = number * 2;
                if (number / 10 > 0) {
                    sum = number % 10 + number / 10 + sum;
                } else {
                    sum = number + sum;
                }

                j = j - 2;
            }

            sum = sum + Character.getNumericValue(splitCardNumber[i]);
            --i;



        }
//        System.out.println(sum);
        value = (sum % 10 == 0)? true : false;

        return value;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String cardNumber = scan.nextLine();

        LuhnsAlgorithm checkNumber = new LuhnsAlgorithm();

        if(checkNumber.checkValidCreditCard(cardNumber)){

            System.out.println("This is a valid Card Number");

        } else {

            System.out.println("This is not a valid number");
        }

    }
}
