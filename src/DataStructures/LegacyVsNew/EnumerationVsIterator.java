package DataStructures.LegacyVsNew;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class EnumerationVsIterator {

    /*
    1)  Enumeration is an Interface defined to enumerate through the collection of objects
        This interface is superseded by Iterator
    2)  Using Enumeration, you can only traverse the Collection object. But using Iterator, you
        can also remove an element while traversing the Collection.
    3)  Enumeration of elements() is not thread-safe, nor is it fail-fast; so it
        can lead to undefined behavior even in a single thread if you modify the
        vector during iteration.
    4)  Vector implements the JDK 1.2 List interface, and is therefore a fully
        compliant Collection object. The iterators are fail-fast - if external
        code structurally modifies the vector, any operation on the iterator will
        then throw a {@link ConcurrentModificationException}. The Vector class is
        fully synchronized, but the iterators are not. So, when iterating over a
        vector, be sure to synchronize on the vector itself.

    */
    public static void main(String args[]) {
        Enumeration days;
        Iterator idays;
        Vector dayNames = new Vector();

        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();

        System.out.println("Output Using Enumeration");
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }

        System.out.println("------------------------------------------------------");

        System.out.println("Output using Iterator");
        idays = dayNames.iterator();
        while (idays.hasNext()) {
            System.out.println(idays.next());
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Output using List ");
        for (int i = 0; i < dayNames.size(); i++)
            System.out.println(dayNames.get(i));
    }

}


