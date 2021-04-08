import java.util.ArrayList;
import java.util.List;

public class Contenido {
    private String nombre;
    public Genero genero;
    //Idioma Origen
    public Idioma idiomaOrigen;
    public int añoLanzamiento;
    public List<Actor> actores = new ArrayList<>();


   // GET Y SET DE NOMBRE

   public String getNombre(){
    return this.nombre;
    }
   public void setNombre(String nombre){
    this.nombre = nombre;
     }




}