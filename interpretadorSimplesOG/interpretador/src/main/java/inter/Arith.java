package inter;

import lexer.*; import symbols.*;

public class Arith extends Op {
    public Expr expr1, expr2;
    public Arith(Token tok, Expr x1, Expr x2) {
        super(tok, null); // null porque no se sabe el tipo
        expr1 = x1; expr2 = x2;
        type = Type.max(expr1.type, expr2.type); // el tipo es el maximo de los dos
    }
    public Expr gen() {
        return new Arith(op, expr1.reduce(), expr2.reduce()); // reduce los dos operandos
    }
    public String toString() {
        return expr1.toString() + " " + op.toString() + " " + expr2.toString(); // devuelve la cadena de la expresion
    }
}
