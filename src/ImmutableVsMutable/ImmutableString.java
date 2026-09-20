package ImmutableVsMutable;

public class ImmutableString {

    public static void main(String[] args){

        //Immutable object can hold reference of another object , like in the example below if
        // a new String instance can be created and assigned to immutable variable

        String immutable = " This is a immutable string";

        immutable = new String("Hello");

        String immutablly = "This string is new type";

        System.out.println(immutablly);

        immutablly = "This is a changed value";

        immutablly.concat("add new value");






        System.out.println(immutable);
        System.out.println(immutablly);
    }
}


