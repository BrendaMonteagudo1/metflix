import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private int numero;
    public String nombre; //Esto es el nombre de la temporada y no del capitulo
    public List<Episodio> episodios  = new ArrayList<>();

    public Episodio buscarEpisodio(int numeroEpisodio){
    
        for (Episodio episodio : this.episodios){
            if (episodio.getNumero() == numeroEpisodio)
                return episodio;
        }
        return null;
    }


  // GET Y SET DE NUMERO

    public int getNumero(){
    return this.numero;
    }

    public void setNumero(int numero){
    this.numero = numero;
    }




}
