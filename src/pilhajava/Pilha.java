
package pilhajava;
public class Pilha<T> {
    private int topo;
    private T[] elementos;
    
    public Pilha(int tamanho){
          elementos =(T[]) new Object[tamanho];
          this.topo = -1;
    }
    
}
