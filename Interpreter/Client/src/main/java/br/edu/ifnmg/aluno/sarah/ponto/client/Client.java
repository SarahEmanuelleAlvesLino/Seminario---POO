/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.aluno.sarah.ponto.client;

/**
 *
 * @author Dell
 */
public class Client {

    // Método que constrói a regra: "A pessoa é da família Silva OU Santos?"
    public static AbstractExpression getRegraFamilia() {
        AbstractExpression silva = new TerminalExpression("Silva");
        AbstractExpression santos = new TerminalExpression("Santos");
        return new OrExpression(silva, santos);
    }

    public static void main(String[] args) {
        AbstractExpression regra = getRegraFamilia();

        Context contexto1 = new Context("João da Silva");
        Context contexto2 = new Context("Maria Oliveira");
        Context contexto3 = new Context("José dos Santos");

        System.out.println(contexto1.getNome() + " pertence à família? " + regra.interpret(contexto1));
        System.out.println(contexto2.getNome() + " pertence à família? " + regra.interpret(contexto2));
        System.out.println(contexto3.getNome() + " pertence à família? " + regra.interpret(contexto3));
    }

}
