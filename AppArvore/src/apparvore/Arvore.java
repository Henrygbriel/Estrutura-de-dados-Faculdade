/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apparvore;

/**
 *
 * @author henry
 */
public class Arvore {
    private Celula raiz;
    
    public Arvore(){
        this.raiz = null;
    }
    
    public void adicionar(int valor){
        Celula novaCelula = new Celula(valor);
        if(this.raiz == null){
            this.raiz = novaCelula;    
        }else{
            Celula atual = new Celula();
            atual = this.raiz;
            while(true){ 
                if(atual.getValor() > novaCelula.getValor()){
                    if(atual.getEsquerda() != null){
                        atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novaCelula);
                        break;
                    }

                }else{
                    if(atual.getDireita() != null){
                        atual = atual.getDireita();
                    }else{
                        atual.setDireita(novaCelula);
                        break;
                    }
                }

                
            }
        }
    }
    
    public void emOrdem(Celula atual){
        if(atual != null){
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }
        
    }
    
    public void preOrdem(Celula atual){
        if(atual != null){
            System.out.println(atual.getValor());
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
        
    }
    
    public void posOrdem(Celula atual){
        if(atual != null){
            
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }
        
    }
    public Celula getRaiz() {
        return raiz;
    }

    public void setRaiz(Celula raiz) {
        this.raiz = raiz;
    }
    
    
    

}
