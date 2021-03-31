import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    
    //Metodo que inicializa el catalogo cno las pelis/series qeu querramos
    public void inicializarCatalogo(){
    
        

        //Pelis: Titanic, Batman: El caballero de la noche 
        Pelicula titanic; //declara una variable que apuntara a una Pelicula
        titanic = new Pelicula(); //Estas ultimoas 2 lineas: Pelicula titanic = new Pelicula();

        titanic.nombre = "Titanic";
        titanic.añoLanzamiento = 1997;
        titanic.duracion = 210; //3hs 30

        Actor actor = new Actor();
        actor.nombre = "Leo DiCaprio";

        //Agrego a la lista de actores del objeto titanic
        titanic.actores.add(actor); //metodo Add -> agregar a una lista

        //Recien ahora estoy agregando a Titanic al catalogo
        this.peliculas.add(titanic);

        //Otra Peli
        Pelicula batman = new Pelicula();
        batman.nombre = "Batman: el caballero de la nohe";
        batman.añoLanzamiento = 2008;
        batman.duracion = 152;

        //No voy a declarar otra variable actor, voy a reusar
        //siempre primero antes de reusar
        // re instanciar
        actor = new Actor(); //Creo un nuevo actor, pero referenciado con la variable actor
        actor.nombre = "Christian Bale";

        batman.actores.add(actor);

        this.peliculas.add(batman);

        //How I met your mother. Serie

        Serie howIMetYM = new Serie();
        howIMetYM.nombre = "How I met your mother";
        howIMetYM.añoLanzamiento = 2005;
        
        actor = new Actor();
        actor.nombre = "Neil Patrick Harris";

        howIMetYM.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Cobie Smulders";

        howIMetYM.actores.add(actor);
        
        //T5:E11
        //creo la temporada
        Temporada temporada = new Temporada();
        temporada.numero = 5;
     
        //Creo el episodio
        Episodio episodio = new Episodio();
        episodio.nombre = "The last cigarrette";
        episodio.numero = 11;

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Definitions";
        episodio.numero = 1;

        temporada.episodios.add(episodio);

        //Agrego la temporada
        howIMetYM.temporadas.add(temporada);


        //T3
        //creo la temporada
        temporada = new Temporada();
        temporada.numero = 3;
     
        //Creo el episodio
        episodio = new Episodio();
        episodio.nombre = "Wait for it";
        episodio.numero = 1;

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Little Boys";
        episodio.numero = 4;

        temporada.episodios.add(episodio);

        //Agrego la temporada
        howIMetYM.temporadas.add(temporada);

        //Aca esta toda la serie con 2 temporadas y cada una con 2 episodios.
        this.series.add(howIMetYM);

        Serie bbt = new Serie();
        bbt.nombre = "The BigBang Theory";
        bbt.añoLanzamiento = 2007;
        
        actor = new Actor();
        actor.nombre = "Kaley Cuoco";

        bbt.actores.add(actor);

        
        //creo la temporada
        temporada = new Temporada();
        temporada.numero = 1;
     
        //Creo el episodio
        episodio = new Episodio();
        episodio.nombre = "Pilot";
        episodio.numero = 1;

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "The Cooper-Hofstadter Polarizatio";

        temporada.episodios.add(episodio);

        //Agrego la temporada
        bbt.temporadas.add(temporada);

        this.series.add(bbt);

        /// PELICULA HECHA POR BREN
        Pelicula armageddon; 
        armageddon = new Pelicula(); 

        titanic.nombre = "Armageddon";
        titanic.añoLanzamiento = 1998;
        titanic.duracion = 153; //2 horas 33 min

        actor = new Actor();
        actor.nombre = "Bruce Willis";

        //Agrego a la lista de actores del objeto armageddon
        armageddon.actores.add(actor); 

        //agrego armageddon a catalogo
        this.peliculas.add(armageddon);

        // PELICULA HECHA POR BREN

        //SERIE HECHA POR BREN

        Serie friends = new Serie();
        friends.nombre = "Friends";
        friends.añoLanzamiento = 1994;
        
        actor = new Actor();
        actor.nombre = "Jennifer Aniston";

        friends.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Lisa Kudrow";

        friends.actores.add(actor);
        
        //Temporada1  episodio 1
        
        Temporada temporada1 = new Temporada();
        temporada1.numero = 1;
     
        //Creo el episodio
        episodio = new Episodio();
        episodio.nombre = "Piloto";
        episodio.numero = 1;

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);


        //Agrego la temporada
        friends.temporadas.add(temporada);

        this.series.add(friends);

      /// PELICULA HECHA POR BREN
        Pelicula forrestGump; 
        forrestGump = new Pelicula(); 

        forrestGump.nombre = "Forrest Gump";
        forrestGump.añoLanzamiento = 1994;
        forrestGump.duracion = 142; //2 horas 22 min

        Director director = new Director();
        director.nombre = "Robert zemeckis";

        actor = new Actor(); // instanciamos actor
        actor.nombre = "Tom Hanks";

        //Agrego a la lista de actores del objeto armageddon
        forrestGump.actores.add(actor); 

        //agrego armageddon a catalogo
        this.peliculas.add(forrestGump);



        // PELICULA HECHA POR BREN

        Serie sexEducation = new Serie();
        sexEducation.nombre = "Sex Education";
        sexEducation.añoLanzamiento = 2019;
        
        actor = new Actor();
        actor.nombre = "Gillian Anderson";

        sexEducation.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Patricia Allison";

        sexEducation.actores.add(actor);
        
        //Temporada2  episodio 5
        
        Temporada temporada2 = new Temporada();
        temporada2.numero = 2;
     
        //Creo el episodio
        episodio = new Episodio();
        episodio.nombre = "5";
        episodio.numero = 5;

        //vinculo temporada con episodio
        temporada2.episodios.add(episodio);


        //Agrego la temporada
        sexEducation.temporadas.add(temporada2);


         
        Temporada temporada3 = new Temporada();
        temporada3.numero = 3;
     
        //Creo el episodio
        episodio = new Episodio();
        episodio.nombre = "2";
        episodio.numero = 2;

        director = new Director();
        director.nombre = "Gillian Anderson";

        //vinculo temporada con episodio
        temporada3.episodios.add(episodio);

        //Agrego la temporada
        sexEducation.temporadas.add(temporada3);


        this.series.add(sexEducation);

      /// SERIE HECHA POR BREN


    }
    
    public Pelicula buscarpelicula(String nombreABuscar){ 
        for (Pelicula pelicula : this.peliculas) {
            if (pelicula.nombre.equals(nombreABuscar))
                return pelicula; 
        }
        return null;
     }
     //public Pelicula buscarpelicula(String peliculaABuscar){
       // System.out.println("ingrese pelicula a buscar");
        //Scanner Entrada = new Scanner(System.in);
        //String peliculaABuscar;
        //peliculaABuscar = Entrada.nextInt();

       //for(Pelicula pelicula : this peliculas){
           //if (pelicula.nombre.equals(peliculaABuscar))
           //return peliculaABuscar;
           //}
           //return null;
           //}

        

    public Serie buscarSerie(String nombreABuscar){

        // series = | serie1 | serie2 | serie25 | serie40 |
        //vamos a usar el foreach: que sirve para recorrer listas
        //este ciclo, tiene una variable, qeu apunta en cada vuelta
        //a cada elemento de la lista
        //o sea la primer vez, va a apuntar a serie1, despues a serie2 ddesp
        //serie25 hasta que termina.
        for (Serie serie : this.series) {
            //pregunto si el nombre de la serie actual
            //que estoy recorriendo es la que necesito
            if (serie.nombre.equals(nombreABuscar))
                return serie; //devuelvo esta serie.
        }
        //si llego hasta aca, es porque no encontro la serie.
        return null;

    
       }
    }



    //buscar un director
    //

