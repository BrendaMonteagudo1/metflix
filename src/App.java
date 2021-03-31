
public class App {
    public static void main(String[] args) throws Exception {
        //A partir de Metflix, buscar la temporada 5 episodio 1 de la serie
        //How I met your mother y 
        //reproducir el episodio.

        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo();//Estoy llamando al metodo que crea las pelis y series.

        Serie serieBuscada = miMetflix.buscarSerie("How I met your mother"); // busca la serie

        if (serieBuscada == null){
           System.out.println(" no se encontro serie");
            return;
        }
        Temporada temporada = serieBuscada.buscarTemporada(5); // busca el numero de temporada

        Episodio episodio = temporada.buscarEpisodio(1); //busca el numero de serie

        episodio.reproducir();


     



    }
}
