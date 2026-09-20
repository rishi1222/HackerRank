package DataTypes;

public class StringBuffervsStringReader {
    /*
    * StringBuffer is synchronized, StringBuilder is not.
    * String Buffer
    * A thread-safe, mutable sequence of characters. A string
    * buffer is like a String, but can be modified. At any point
    * in time it contains some particular sequence of characters,
    * but the length and content of the sequence can be changed
    * through certain method calls.
    * String buffers are safe for use by multiple threads. The
    * methods are synchronized where necessary so that all the
    * operations on any particular instance behave as if they
    * occur in some serial order that is consistent with the
    * order of the method calls made by each of the individual
    * threads involved.
    * StringReader
    * A mutable sequence of characters. This class provides an
    * API compatible with StringBuffer, but with no guarantee of
    * synchronization. This class is designed for use as a
    * drop-in replacement for StringBuffer in places where the
    * string buffer was being used by a single thread (as is
    * generally the case). Where possible, it is recommended
    * that this class be used in preference to StringBuffer as
    * it will be faster under most implementations*/
}
