.PHONY : all run clean

all : Main.class

VhdlLexer.java VhdlParser.java : Vhdl.g
	java -cp antlr-3.5-complete.jar org.antlr.Tool $<

Main.class : Main.java VhdlLexer.java VhdlParser.java ANTLRNoCaseFileStream.java
	javac -cp .:antlr-3.5-complete.jar $<

clean :
	rm -f *.class VhdlLexer.java VhdlParser.java

run : all
	java -cp .:antlr-3.5-complete.jar Main adder.vhdl