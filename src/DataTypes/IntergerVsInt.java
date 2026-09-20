package DataTypes;

public class IntergerVsInt {

    public static void main(String[] args){
        /* I know this is probably very stupid, but a lot of places claim that the Integer class in Java is immutable,
           yet the following code:*/

        Integer a=3;
        Integer b=3;
        a+=b;
        System.out.println(a);

        /*Immutable does not mean that a can never equal another value. For example, String is immutable too, but I can still do
          this: */
            String str = "hello";
            // str equals "hello"
            str = str + "world";
            System.out.println(str);
            // now str equals "helloworld"
        /*
           str was not changed, rather str is now a completely newly instantiated object, just as your Integer is. So the value
           of a did not mutate, but it was replaced with a completely new object, i.e. new Integer(6).*/
    }
}
