package InputOutput.StreamVsReaderWriter;

/* InputStream
 * Reads the next byte of data from the input stream. The value byte is
 * returned as an <code>int</code> in the range <code>0</code> to
 * <code>255</code>. If no byte is available because the end of the stream
 * has been reached, the value <code>-1</code> is returned. This method
 * blocks until input data is available, the end of the stream is detected,
 * or an exception is thrown.
 *
 * <p> A subclass must provide an implementation of this method.
 *
 * @return     the next byte of data, or <code>-1</code> if the end of the
 *             stream is reached.
 * @exception  IOException  if an I/O error occurs.
 *
 * If you are reading image data or a binary file this is the stream to use.
*/

/*Reader
* A Reader is defined for character streams. If the information you are reading is all text , then the Reader will take
* care of the character decoding for you and give you unicode characters from the raw input stream
* */

/*
* The InputStream is the ancestor class of all possible streams of bytes, it is not useful by itself but all the subclasses (like the FileInputStream that you are using) are great to deal with binary data.

On the other hand, the InputStreamReader (and its father Reader) are used specifically to deal with characters (so strings) so they handle charset encodings (utf8, iso-8859-1, and so on) gracefully.

Java has already established a default Character Encoding conversion that is dependent on the platform you are running.*/

/*
What Character encoding does Hadoop Uses

* By default Hadoop uses UTF-8 encoding so you don't have to provide such options.
I assume you use Text for your keys/values. According to the javadoc: "This class stores text using standard UTF8 encoding"
*/

import java.io.*;

public class InputStreamVsReader {

/*
     * Input Stream
 * @see     java.io.BufferedInputStream
 * @see     java.io.ByteArrayInputStream
 * @see     java.io.DataInputStream
 * @see     java.io.FilterInputStream
 * @see     java.io.InputStream#read()
 * @see     java.io.OutputStream
 * @see     java.io.PushbackInputStream
 *
 * Output Stream
 * @see     java.io.BufferedOutputStream
 * @see     java.io.ByteArrayOutputStream
 * @see     java.io.DataOutputStream
 * @see     java.io.FilterOutputStream
 * @see     java.io.InputStream
 * @see     java.io.OutputStream#write(int)
            */

/*
Reader

 * @see BufferedReader
 * @see   LineNumberReader
 * @see CharArrayReader
 * @see InputStreamReader // acts as bridge between input Stream and input Reader
 * @see   FileReader
 * @see FilterReader
 * @see   PushbackReader
 * @see PipedReader
 * @see StringReader
 *
 * Writer
 *
 * @see   BufferedWriter
 * @see   CharArrayWriter
 * @see   FilterWriter
 * @see   OutputStreamWriter // acts as a bridge between output Stream and output Reader
 * @see   FileWriter
 * @see   PipedWriter
 * @see   PrintWriter
 * @see   StringWriter
 **/

public static void main(String[] args){
    String s = "some text here";
    try {
        //convert String to byte array
        byte[] b = s.getBytes("UTF-8");
        System.out.println(b);

        //convert byte[] to String using ASCII encoding
         s = new String(b, "US-ASCII");
         System.out.println(s);
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }
}

}
