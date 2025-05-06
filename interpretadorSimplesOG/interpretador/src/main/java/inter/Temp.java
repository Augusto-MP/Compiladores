package inter;

import lexer.*; import symbols.*;

public class Temp extends Expr{
    static int count = 0;
    int number = 0;
    public Temp(Type p) { super(Word.temp, p); number = ++count; } // incrementa o contador e atribui o valor a number
    public String toString() { return "t" + number; } // retorna o número temporário
}
