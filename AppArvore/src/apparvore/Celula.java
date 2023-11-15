/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apparvore;

/**
 *
 * @author henry
 */
public class Celula {
    private int valor;
    private Celula direita;
    private Celula esquerda;

    public Celula(){}
    public Celula(int valor){
        this.valor = valor;
        this.direita = null;
        this.esquerda = null;
    }
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Celula getDireita() {
        return direita;
    }

    public void setDireita(Celula direita) {
        this.direita = direita;
    }

    public Celula getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Celula esquerda) {
        this.esquerda = esquerda;
    }
    
    
}
