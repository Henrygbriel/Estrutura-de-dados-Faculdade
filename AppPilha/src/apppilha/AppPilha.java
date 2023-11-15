/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apppilha;

/**
 *
 * @author henry
 */
public class AppPilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        PilhaLigada pilha = new PilhaLigada();
        
        try {
            pilha.empilha(1);
            pilha.empilha(2);
            pilha.empilha(3);

            pilha.exibirPilha();

            pilha.desempilha();
            pilha.exibirPilha();
        } catch (Exception e) {
            System.out.println("A pilha está vazia");
        }
        
       
    }
    
}
