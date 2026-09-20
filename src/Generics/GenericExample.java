package Generics;

import java.lang.reflect.Method;

class Printer {

    public <T> T printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
        return (T) array.getClass().getName();
    }

}

public class GenericExample {
    public static void main(String args[]) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        System.out.println(myPrinter.printArray(intArray));
        System.out.println(myPrinter.printArray(stringArray));
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            System.out.println(name);
            if (name.equals("printArray")) {
                count++;
            }

        }

        if (count > 1) {
            System.out.println("Method overloading is not allowed!");
        }
    }
}
