/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package applistaligada;

/**
 *
 * @author henry
 */
public class Lista {
    private Celula primero;
    private Celula ultimo;
    private int tamanho;

    public Lista(){
        this.tamanho = 0;
    }
    
    public void adicionar(int valor){
        Celula novaCelula = new Celula(valor);
        if(estaVazia()){
            this.primero = novaCelula;
            this.ultimo = novaCelula;
            novaCelula.setProximo(null);
            
        }else{
            this.ultimo.setProximo(novaCelula);
            this.ultimo = novaCelula;
        }
        this.tamanho++;
        
    }
    
    public void remove(){
        Celula anterior = null;
        Celula atual = this.primero;
        
        for(int i=0; i < this.tamanho; i++){
            anterior = atual;
            atual = atual.getProximo();
            if(atual == this.ultimo){
                anterior.setProximo(null);
            }
        }
        this.tamanho--;
    }
    public void exibir(){
        Celula novaCelula = new Celula();
        novaCelula = this.primero;
        for(int i=0; i < this.tamanho; i++){
            System.out.println(novaCelula.getValor());
            novaCelula = novaCelula.getProximo();
        }
    }
    
    public boolean estaVazia(){
        return this.primero == null;
    }
    
    public Celula getPrimero() {
        return primero;
    }

    public void setPrimero(Celula primero) {
        this.primero = primero;
    }

    public Celula getUltimo() {
        return ultimo;
    }

    public void setUltimo(Celula ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
