.PHONY : all run

all : Main.class

VhdlLexer.java VhdlParser.java : vhdl.g
	java -cp antlr-2.7.7.jar antlr.Tool $<

Main.class : Main.java VhdlLexer.java VhdlParser.java
	javac -cp .:antlr-2.7.7.jar $<

clean :
	rm -f *.class VhdlLexer.java VhdlParser.java

run : all
	java -cp .:antlr-2.7.7.jar Main adder.vhdl