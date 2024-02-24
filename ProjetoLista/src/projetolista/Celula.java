//Nó/celula DA LISTA
package projetolista;

public class Celula {
    
    //valor que vai na CELULA/NÓ da lista
    private String valor;
    
    //Ponteiro que vai apontar para a proxima CELULA/NÓ
    private Celula proximo;

    //criando os metodos Getters e Setters
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
    
    
}
