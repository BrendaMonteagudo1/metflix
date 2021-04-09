import java.util.ArrayList;
import java.util.List;

public class Contenido {
    private String nombre;
    private Genero genero;
    //Idioma Origen
    private Idioma idiomaOrigen;
    private int añoLanzamiento;
    public List<Actor> actores = new ArrayList<>();


   // GET Y SET DE NOMBRE

   public String getNombre(){
    return this.nombre;
    }
   public void setNombre(String nombre){
    this.nombre = nombre;
    }

    // GET Y SET DE GENERO

   public Genero getGenero(){
    return this.genero;
    }
   public void setGenero(Genero genero){
    this.genero = genero;
    }

    // GET Y SET DE IDIOMA

   public Idioma getIdiomaOIdioma(){
    return this.idiomaOrigen;
    }
   public void setIdiomaOrigen(Idioma idiomaOrigen){
    this.idiomaOrigen = idiomaOrigen;
    }

    // GET Y SET DE AÑO DE LANZAMIENTO

    public int getAñoLanzamiento(){
        return this.añoLanzamiento;
        }
    public void setAñoLanzamiento(int añoLanzamiento){
        this.añoLanzamiento = añoLanzamiento;
        }









}