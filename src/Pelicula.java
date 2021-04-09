public class Pelicula extends Contenido {
    private int duracion; //en minutos
    private Director director;
    public boolean filmadaEnIMAX;


   // GETT Y SETT DE DURACION

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



}
