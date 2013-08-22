import java.io.*;
import org.antlr.v4.runtime.*;
 
/**
 * http://www.antlr.org/wiki/pages/viewpage.action?pageId=1782
 * @author Jim Idle
 */
public class ANTLRNoCaseFileStream  extends ANTLRFileStream {
    public ANTLRNoCaseFileStream(String fileName) throws IOException {
        super(fileName, null);
    }
 
    public ANTLRNoCaseFileStream(String fileName, String encoding)
    throws IOException {
        super(fileName, encoding);
    }
 
    public int LA(int i) {
        if ( i==0 ) {
            return 0; // undefined
        }
        if ( i<0 ) {
            i++; // e.g., translate LA(-1) to use offset 0
        }
 
        if ( (p+i-1) >= n ) {
            return CharStream.EOF;
        }
        return Character.toLowerCase(data[p+i-1]);
    }
}