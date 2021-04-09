public class Episodio {
    private int numero;
    private String nombre;
    private int duracion; //en minutos
    private Director director;
    private String sinopsis;

    public void reproducir(){
        System.out.println("Reproduciendo episodio " + nombre);
    }

    // CONSTRUCTOR
    public Episodio(String nombre, int numero){
        this.nombre = nombre;
        this.numero = numero;
    }

   // GET Y SET DE NUMERO

    public int getNumero(){
    return this.numero;
    }

    public void setNumero(int numero){
    this.numero = numero;
    }

    // GET Y SET DE NOMBRE

    public String getNombre(){
        return this.nombre;
        }
    public void setNombre(String nombre){
        this.nombre = nombre;
         }
        
    // GET Y SET DE DURACION  
    public int getDuracion(){
        return this.duracion;
        }
    
        public void setDuracion(int duracion){
        this.duracion = duracion;
        }
      
    // GET Y SET DE DIRECTOR

    public Director getDirector(){
        return this.director;
        }
    public void setDirector(Director director){
        this.director = director;
         }
    
    // GET Y SET DE SINOPSIS

    public String getSinopsis(){
        return this.sinopsis;
        }
    public void setSipnopsis(String sinopsis){
        this.sinopsis = sinopsis;
         }

  }

           










