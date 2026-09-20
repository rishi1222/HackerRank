package TestDrivenTesting;

/*
* How do I write a test that passes when an expected exception is thrown?
Add the optional expected attribute to the @Test annotation. The following is an example test that passes when the expected IndexOutOfBoundsException is raised:
@Test(expected=IndexOutOfBoundsException.class)
public void testIndexOutOfBoundsException() {
    ArrayList emptyList = new ArrayList();
    Object o = emptyList.get(0);
}

[top]

How do I write a test that fails when an unexpected exception is thrown?
Declare the exception in the throws clause of the test method and don't catch the exception within the test method. Uncaught exceptions will cause the test to fail with an error.
The following is an example test that fails when the IndexOutOfBoundsException is raised:
@Test
public void testIndexOutOfBoundsExceptionNotRaised()
    throws IndexOutOfBoundsException {

    ArrayList emptyList = new ArrayList();
    Object o = emptyList.get(0);
}
*/

public class TestExceptions {
}
