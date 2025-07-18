/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.aluno.sarah.ponto.ciente;

/**
 *
 * @author Dell
 */
public abstract class ComputerAssembly {

    /**
     * Este é o Template Method. Ele define a sequência de passos para a montagem.
     * Corresponde ao 'templateMethod()' do diagrama.
     * 
     */
    public final void assembleComputer() {
        installMotherboard();
        primitiveOperation1(); // Instalar CPU 
        primitiveOperation2(); // Instalar RAM 
        System.out.println("Computador montado com sucesso!");
    }

    // Um passo concreto, comum a todas as montagens, que não está no diagrama genérico.
    private void installMotherboard() {
        System.out.println("Instalando a placa-mãe padrão.");
    }

    /**
     * Operações Primitivas que serão implementadas pelas subclasses.
     * 
     */
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
}
