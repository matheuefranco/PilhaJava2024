
package pilhajava;
public class Pilha<T> {
    private int topo;
    private T[] elementos;
    
    public Pilha(int tamanho){
          elementos =(T[]) new Object[tamanho];
          this.topo = -1;
    }
    public boolean isFull(){
        return topo==elementos.length-1;
        /*if(topo==elementos.length-1)
            return true;
        return false; */
    }
    public boolean isEmpty(){
        // return this.topo==-1;
        if(this.topo==-1)
            return true;
        return false;
    }
    
}
