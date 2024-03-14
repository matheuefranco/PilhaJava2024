
package pilhajava;

import java.time.LocalDate;

public class Recorde {
    private String nome;
    private double tempo;
    private LocalDate data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    @Override
    public String toString(){
        return "[Nome:"+this.nome+" data:"+ 
                this.data + " tempo:"+ this.tempo+"]";
    }
    
    
}
