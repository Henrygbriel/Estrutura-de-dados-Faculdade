/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apppilha;

/**
 *
 * @author henry
 */
public class PilhaLigada {
    private int tamanho;
    private Celula topo;

    public PilhaLigada(){}
    
    public void empilha(int valor){
        Celula auxiliar;
        Celula novaCelula = new Celula(valor);
        if(vazia()){
            this.topo = novaCelula;
            novaCelula.setProximo(null);
        }else{
            auxiliar = this.topo;
            this.topo = novaCelula;
            novaCelula.setProximo(auxiliar);
        }
        this.tamanho++;
        
        
    }
    
    public void desempilha() throws Exception{
        if(!vazia()){
            Celula aux;
            aux = this.topo;
            this.topo = topo.getProximo();
            this.tamanho--; 
            aux = null;
        }else{
            throw new Exception("A pilha está vazia");
        }
        
        
    }
    
    public void exibirPilha(){
        Celula novaCelula = new Celula();
        novaCelula = this.topo;
        for(int i=0; i < this.tamanho; i++){
            System.out.println(novaCelula.getValor());
            novaCelula = novaCelula.getProximo();
        }
        
    }
    
    public boolean vazia(){
        return this.topo == null;
    }
    public Celula getTopo() {
        return topo;
    }

    public void setTopo(Celula topo) {
        this.topo = topo;
    }
    
    
}
