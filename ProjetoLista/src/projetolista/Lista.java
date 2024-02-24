
package projetolista;

public class Lista {
    
    //CABEÇA/PRIMEIRA Celula/nó da lista
    private Celula cabeca;
    
    //para inserir um novo elemento precisamos de um metodo "adiciona"
    public void adiciona(String valor){
        
        //quando for insserir um novo valor devo instanciar um novo objeto do tipo Celula
        Celula novaCelula = new Celula();
        
        //atribuindo/colocando o valor na nova celula
        novaCelula.setValor(valor);
        
        //apontando o proximo da nova celula que vai ser a cabeça
        novaCelula.setProximo(cabeca);
        
        //e a nova celula se tornará a cabeca da lista
        cabeca = novaCelula;
        
        
        
    }
    
    public void removePrimeiro() {
        //se a cabeca da lista nao for nula significa que tem um valor, logo é possivel remove-lo
        if (this.cabeca != null) {
            
            //a cabeca será armazenada na variavel remove
            Celula remove = this.cabeca;
            
            //como o remove até o momento é a cabeca e seu proximo é o segundo elemento
            
            //fazemos a cabeca receber o proximo de remove, sendo assim o proximo de remove vira o primeiro valor
            this.cabeca = remove.getProximo();
            
        }
    }

    //Esse toString vai transformar a lista em String para podermos mostra-la em tela
    
    @Override//indica que implementamos o metodo na subclasse
    public String toString() {
        //string buffer é uma classe que vai otimizar a construção de strings grandes
        StringBuffer sb = new StringBuffer();
        
        //mostrar a lista na tela
        sb.append("[");
        
        
        Celula p = cabeca;
        while(p != null){
            sb.append(p.getValor() + " ");
            p = p.getProximo();
        }
        
        
        sb.append("]");
        return sb.toString();
    }
    
    
}
