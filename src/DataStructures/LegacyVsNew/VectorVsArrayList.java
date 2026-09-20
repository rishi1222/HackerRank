package DataStructures.LegacyVsNew;

/*
1)  Vector class is mutable and synchronized were as ArrayList is mutable but not synchronized.
2)  Vector contains many legacy methods that are not part of the collections framework.
 */

import java.util.ArrayList;
import java.util.Vector;

public class VectorVsArrayList {

    public static void main(String[] args) {

        Vector<String> vec = new Vector<String>();

        ArrayList<String> arrList = new ArrayList<String>();

        vec.add("This");
        vec.add("is");
        vec.add("a");
        vec.add("String");

        arrList.add("This");
        arrList.add("is");
        arrList.add("even");
        arrList.add("longer");
        arrList.add("String");

        System.out.println("This is output from vector");
        for(String val : vec){
            System.out.println(val);
        }

        System.out.println("-----------------------------");
        System.out.println("This is output from ArrayList");
        for(String val : arrList){
            System.out.println(val);
        }


    }
}

