.PHONY : all run clean

all : Main.class

VhdlLexer.java VhdlParser.java : Vhdl.g
	java -cp antlr-4.1-complete.jar org.antlr.v4.Tool Vhdl.g

Main.class : Main.java VhdlLexer.java VhdlParser.java ANTLRNoCaseFileStream.java
	javac -cp .:antlr-4.1-complete.jar $<

clean :
	rm -f *.class VhdlLexer.java VhdlParser.java VhdlBaseListener.java VhdlListener.java

run : all
	java -cp .:antlr-4.1-complete.jar Main adder.vhdl
