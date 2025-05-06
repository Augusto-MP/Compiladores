package Main;

import java.io.*; import lexer.*; import parser.*;

public class Main 
{
    public static void main( String[] args ) throws IOException {
        
        //System.out.println( "Hello World!" );
        Lexer lex = new Lexer();
        Parser parse = new Parser(lex);
        parse.program();
        System.out.write('\n'); 
        System.out.println("Compilação concluída com sucesso!\n");
        System.out.println("Tamanho da memória: " + parse.getUsed() + " bytes\n");
    }
}
