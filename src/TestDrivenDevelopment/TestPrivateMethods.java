package TestDrivenDevelopment;

/*
[top]

How do I test protected methods?
Place your tests in the same package as the classes under test.
* For example:
src
   com
      xyz
         SomeClass.java
         SomeClassTest.java
While adequate for small projects, many developers feel that this approach clutters the source directory, and makes it hard to package up client deliverables without also including unwanted test code, or writing unnecessarily complex packaging tasks.
An arguably better way is to place the tests in a separate parallel directory structure with package alignment.
For example:
src
   com
      xyz
         SomeClass.java
test
   com
      xyz
         SomeClassTest.java
These approaches allow the tests to access to all the public and package visible methods of the classes under test.
Some developers have argued in favor of putting the tests in a sub-package of the classes under test (e.g. com.xyz.test). The author of this FAQ sees no clear advantage to adopting this approach and believes that said developers also put their curly braces on the wrong line. :-)


Solution: Package Private
By removing the private modifier, the method is visible in the package of the class, and nowhere else. This means that the method can now be unit tested (provided that the same package is used in the test class). But aren’t we exposing too much of the internals of the class?
The answer is no. The public interface of the class is still only the public methods in the class. Unless the calling class is in the same package, it can’t use the package private methods. Furthermore, you most likely have direct control over all classes in the same package. By direct control I mean that you can check out the code, make modifications to it, and check it back in again. So it is pointless to hide methods by making them private. Whoever feels the need to call one of the private methods from another class in the same package could just change the access modifier from private to package private or public and be done.
The idea of the original class is that its interface is the public methods. The package private methods are only helper methods, and not meant to be used from outside the class. For classes in the same package, we already rely on them to use it correctly (it can’t be enforced anyway). For classes outside the package, either by another team, or from external use, the only access is via the public methods, so the encapsulation is not broken where it matters.*/

public class TestPrivateMethods {
}
