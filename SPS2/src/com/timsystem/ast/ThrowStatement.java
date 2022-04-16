package com.timsystem.ast;

import com.timsystem.lib.SPKException;

public class ThrowStatement implements Statement{

    private String type;
    private Expression expr;

    public ThrowStatement(String type, Expression expr) {
        this.type = type;
        this.expr = expr;
    }


    @Override
    public void execute() {
        throw new SPKException(type, expr.eval().toString());
    }

    @Override
    public String toString() {
        return "throw " + type + " " + expr;
    }
}
