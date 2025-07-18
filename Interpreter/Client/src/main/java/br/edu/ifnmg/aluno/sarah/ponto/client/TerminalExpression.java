package br.edu.ifnmg.aluno.sarah.ponto.client;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class TerminalExpression implements AbstractExpression {
    private String sobrenome;

    public TerminalExpression(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public boolean interpret(Context context) {
        // A lógica de interpretação é verificar se o nome no contexto contém o sobrenome.
        return context.getNome().contains(this.sobrenome);
    }
}
