package DataStructures.DataStrucImp;

/*The Stack class represents a last-in-first-out(LIFO) stack of objects. It extends the class Vector with five operation
* that allow vector to be treated as Stack. The usual push and pop operation is provided, as well as method to peek
* at the top item on the stack, a method to check the stack is empty , a method to search the stack for an item and
* discover how far it is from the top.
*
* There is no such thing as FiFo Stack as the FiFo implementation is  handled by Queue
*
* Stack is obsolete as the implementation of unbounded array and synchronization is an expensive process
* The replacement for separation of concern can be handled using Collections.synchronizedCollection for more detail read
* Sync Collection vs Concurrent Collection
* A more complete and consistent set of LIFO stack operations is provided by the Deque interface and its implementations, which should be used in preference to this class. For example:
   Deque<Integer> stack = new ArrayDeque<Integer>();
* */

public class LifoStackvsFifoStack {

    private Object lifo ;
    private int currentPosition ;

    public LifoStackvsFifoStack(){
        lifo = new Object[10];
        currentPosition =0;
    }

    public void push(Object value){

        for(int i = 0; i < 10 ; i++){
            if(i == currentPosition){

            }

        }
    }

    public void pop(){
         Object tempLifo;
         tempLifo = lifo;

    }
}
