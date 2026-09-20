package Algorithm;

import java.util.Scanner;

public class Palindrome {

    public boolean checkPalindrome(String value){

        String initialValue = value;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(value).reverse();
        if(stringBuilder.toString().equals(value)){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean palindrome = false;
        String input= sc.next();
        if(!input.trim().isEmpty() || input.trim() != null) {


            char[] splitInput = input.toCharArray();
            int j = input.length() - 1;
            for (int i = 0; i < input.length(); i++) {
                if (splitInput[i] == (splitInput[j])) {
                    System.out.println(splitInput[i] + "  " + splitInput[input.length() - 1]);
                    palindrome = true;
                } else {
                    palindrome = false;
                    break;
                }
                j--;
            }
        }
        if(palindrome==true){
            System.out.println("this is a palindrome");
        }else {
            System.out.print("this is not a palindrome");
        }
    }
}
