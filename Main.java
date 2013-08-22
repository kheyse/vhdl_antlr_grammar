import org.antlr.v4.runtime.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String fname = args[0];
        ANTLRFileStream in = new ANTLRNoCaseFileStream(fname);
        
        VhdlLexer lexer = new VhdlLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VhdlParser parser = new VhdlParser(tokens);
        parser.design_file();
    }
}
