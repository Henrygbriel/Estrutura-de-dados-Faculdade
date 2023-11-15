/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apparvore;

/**
 *
 * @author henry
 */
public class AppArvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arvore arvore = new Arvore();
        arvore.adicionar(10);
        arvore.adicionar(8);
        arvore.adicionar(9);
        arvore.adicionar(5);
        arvore.adicionar(7);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(20);
        
        System.out.println("\n\nEm ordem:");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println("\n\nPre ordem:");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println("\n\nPos ordem:");
        arvore.posOrdem(arvore.getRaiz());
       
    }
}
