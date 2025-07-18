/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.aluno.sarah.ponto.client;

/**
 *
 * @author Dell
 */
public class OrExpression implements AbstractExpression {
    private AbstractExpression expression1; //
    private AbstractExpression expression2; //

    public OrExpression(AbstractExpression expression1, AbstractExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(Context context) {
        return expression1.interpret(context) || expression2.interpret(context); //
    }
}
