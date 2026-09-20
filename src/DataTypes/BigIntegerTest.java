package DataTypes;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {

   public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        //Scanner sc2= new Scanner(System.in);

        BigInteger a = sc1.nextBigInteger();
        BigInteger b = sc1.nextBigInteger();
if(a.toString().length() < 200 && b.toString().length() < 200 && (b.signum() ==1 || b.signum() == 0) && (a.signum() ==1 || a.signum() ==0 )) {

    BigInteger sum = a.add(b);
    BigInteger mul = a.multiply(b);


    System.out.println(sum.toString());
    System.out.println(mul.toString());
}

    }
}
