
package projetolista;

import java.util.Scanner;


public class ProgramaMain {

 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Lista lista = new Lista();
        int opcoes;
        do{
            menu();
            opcoes = ler.nextInt();
            
            switch(opcoes) {
                case 1:{
                    System.out.println("Digite um numero");
                    
                    //lendo o numero do usuario
                    String valor = ler.next();
                    
                    //adicionando o numero do usuario no inicio da lista
                    lista.adiciona(valor);
                    
                    break;
                }       
                
                case 2:{
                    //imprimindo a lista na tela
                    System.out.println(lista.toString());
                    
                    break;
                }
                case 3:{
                  
                    lista.removePrimeiro();
                    break;
                }
                
                case 4:{
                    System.out.println("Fim do programa");
                    break;
                }
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcoes!=4);
    }
    
    public static void menu(){
        System.out.println("1 - Inserir elemento no inicio da lista");
        System.out.println("2 - Mostrar lista");
        System.out.println("3 - remover o primeiro elemento da lista");
        System.out.println("4 - Sair");
    }
    
}
