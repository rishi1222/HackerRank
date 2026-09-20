package TestDrivenDevelopment;
/*
Accessing the Private Constructor
Usually, in order to call the private constructor, the use cases listed above have other public methods that would call the private constructor within the class.

Alternatively, we can use the Java Reflection API to directly access the private constructor.

The Java Reflection API is an advanced feature that allows programs to examine and modify the runtime behavior of the application running within the JVM. Because of this, using this method isn’t recommended as it can lead to difficulty spotting and fixing bugs.

Using Reflection, we can see the methods and attributes of any class and modify or access them bypassing the access modifiers.

The most used case for using reflection is unit testing a class that has private methods. To unit test a private constructor or method using reflection, we’d need to do the following steps:

get the class object for the class that we want to instantiate
with the class object, call the getDeclaredContructor() method to get the Constructor object
on the Constructor object, call the setAccessible() method and make the constructor accessible
after the Constructor object is accessible, we can call the newInstance() method that will create a new object of that class
Let’s create a class with a private constructor. Then we’ll use the Java Reflection API to instantiate it and make sure that the private constructor was called:
 */

public class PrivateConstructorClass {
    private PrivateConstructorClass() {
        System.out.println("Used the private constructor!");
    }
}
