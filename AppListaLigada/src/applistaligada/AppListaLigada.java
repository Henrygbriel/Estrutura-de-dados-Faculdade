
package applistaligada;


public class AppListaLigada {

    public static void main(String[] args) {
       Lista lista = new Lista();
       
       lista.adicionar(1);
       lista.adicionar(2);
       lista.adicionar(3);
       lista.exibir();
       
       lista.remove();
       
       lista.exibir();
       
    }
    
}
