package Algorithm.Recurssion;

import java.util.Scanner;

public class Factorial {


     private int number;
     private int factValue;
     Scanner sc;


    public Factorial(){
        number =0;
        factValue=1;
    }

    public int  getInput(){
        sc = new Scanner(System.in);
        number = sc.nextInt();
        return number;
        }

    public int calFactorial(int value){
        System.out.println("Calling the recursive fucntion" + factValue);

            if(value >= 1)
            {
                factValue =  factValue * value;
                calFactorial(value-1);
            }

            return factValue;

    }

    public static void main(String[] args){

        Factorial fact = new Factorial();
        int value = fact.getInput();
        int factorial = fact.calFactorial(value);

        System.out.println("The factorial using recursion is : " + factorial);

    }
}
