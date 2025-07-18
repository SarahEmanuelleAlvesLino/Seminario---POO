/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.aluno.sarah.ponto.ciente;

/**
 *
 * @author Dell
 */
public class Ciente {

    public static void main(String[] args) {
        System.out.println("--- Iniciando montagem do Computador Básico ---");
        ComputerAssembly basicComputer = new BasicComputerAssembly();
        basicComputer.assembleComputer(); // Chama o template method

        System.out.println("\n--- Iniciando montagem do Computador Gamer ---");
        ComputerAssembly gamerComputer = new GamerComputerAssembly();
        gamerComputer.assembleComputer(); // Chama o mesmo template method
    }

}
