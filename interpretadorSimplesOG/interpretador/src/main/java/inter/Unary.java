package inter;

import lexer.*; import symbols.*;

public class Unary extends Op{
    public Expr expr;
    public Unary(Token tok, Expr x) { // trata operador menos, para !, ver Not
        super(tok, null); expr = x;
        type = Type.max(Type.Int, expr.type);
        if (type == null ) error("type error");
    }
    public Expr gen() { return new Unary(op, expr.reduce()); }
    public String toString() { return op.toString()+" "+expr.toString(); }
}
