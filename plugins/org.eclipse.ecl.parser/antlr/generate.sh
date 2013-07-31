ANTLR_LOC=/Users/ivaninozemtsev/antlr/antlr-3.0/lib
java -cp `ls -1 $ANTLR_LOC/*.jar | tr "\\n" ":"` org.antlr.Tool Ecl.g
