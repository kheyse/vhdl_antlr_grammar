import antlr.*;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws Exception {
        String fname = args[0];
        FileReader rdr = new FileReader(fname);
        
        VhdlLexer m_lexer = new VhdlLexer(rdr);
        m_lexer.setFilename(fname);
        VhdlParser m_parser = new VhdlParser(m_lexer);
        m_parser.setFilename(fname);
        m_parser.design_file();
        rdr.close();
    }
}
