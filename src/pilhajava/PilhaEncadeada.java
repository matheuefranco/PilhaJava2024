package pilhajava;
public class PilhaEncadeada<T> {
    private No<T> topo; // sentinela [ponteiro]
    public PilhaEncadeada(){
        this.topo = null;
    }
    
    public boolean isEmpty(){
        /*if(this.topo==null)
            return true;
        else
            return false;*/
        return this.topo == null;
    }
    //------------------
    public boolean push(T objeto){
        No<T> novoNo = new No<>();
        if(novoNo==null)
               return false;
        novoNo.setDado(objeto);
        novoNo.setProx(this.topo);
        this.topo = novoNo;
        return true;
    }
    //---------------
    public T pop(){
        T dadoRemovido = this.topo.getDado();
        this.topo = this.topo.getProx();
        return dadoRemovido;
    }
    //------------
    public T peek(){
        return topo.getDado();
    }
    //---------------
     @Override
    public String toString(){
        StringBuilder retorno = new StringBuilder();
        // percorrer a lista e adicionar os dados
        No<T> noAtual = this.topo;
        while(noAtual!=null){
            retorno.append(noAtual.getDado()+"\n");
            noAtual = noAtual.getProx();
        }
        retorno.append("-----------");
        return retorno.toString();
    }
}
