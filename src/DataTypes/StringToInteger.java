package DataTypes;

import java.util.Scanner;

public class StringToInteger {

    public void convert(String str){

        Integer intValue = Integer.parseInt(str);
        System.out.println("The String to Integer Conversion value is :" + intValue);

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        StringToInteger stringToint = new StringToInteger();

        stringToint.convert(str);
    }
}
