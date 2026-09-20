package DataStructures.LegacyVsNew;

import java.util.*;

public class HashTableVsHashMap {
    /*
    Difference between HashMap and Hashtable

1)  HashTable class is synchronized. were as HashMap is not synchronized.
2)  Because of Thread-safe, HashTable is slower than HashMap.
3)  HashTable Neither key nor values can be null were as HashMap Both key and values can be null
4)  HashTable Order of table remain changes over time. were as HashMap guarantee that order of map will remain constant over time.
5)  One of the HashMap subclass is is LinkedHashMap, so if you want predictable iteration you can easily swap HashMap for
    LinkedHashMap.

    Notes HashTable
    To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode
    method and the equals method.
    An instance of HashTable has two parameters that affect its performance: initial capacity and load factor.
    The initial capacity controls a trade off between wasted space and the need for rehash operations, which are time-consuming.

    No rehash operations will ever occur if the initial capacity is greater than the maximum number of entries the HashTable will
    contain divided by its load factor. However, setting the initial capacity too high can waste space.

    If many entries are to be made into a HashTable, creating it with a sufficiently large capacity may allow the entries to be
    inserted more efficiently than letting it perform automatic rehashing as needed to grow the table.


    What is a Hashing Function ?

    The problem at hands is to speed up searching. Consider the problem of searching an array for a given value. If the
    array is not sorted, the search might require examining each and all elements of the array. If the array is sorted,
    we can use the binary search, and therefore reduce the worse-case runtime complexity to O(log n). We could search
    even faster if we know in advance the index at which that value is located in the array. Suppose we do have that
    magic function that would tell us the index for a given value. With this magic function our search is reduced to
    just one probe, giving us a constant runtime O(1). Such a function is called a hash function . A hash function is a
    function which when given a key, generates an address in the table.
     */

    public static void main(String args[])
    {
        Hashtable< String,Integer> ht = new Hashtable< String,Integer>();
        ht.put("a",100);
        ht.put("b",200);
        ht.put("c",300);
        ht.put("d",400);

        //Getting Iterator Over the Set of keys in a HashTable
        Set st = ht.entrySet();
        Iterator itr=st.iterator();
        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
            System.out.println(m.getKey()+" "+m.getValue());
        }

        HashMap< String,Integer> hm = new HashMap< String,Integer>();
        hm.put("a",100);
        hm.put("b",200);
        hm.put("c",300);
        hm.put("d",400);
        hm.put(null,null);

        Set stm = hm.entrySet();
        Iterator itrm=stm.iterator();
        while(itrm.hasNext())
        {
            Map.Entry m=(Map.Entry)itrm.next();
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

}
