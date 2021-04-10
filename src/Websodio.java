public class Websodio extends Episodio {

    public Websodio(int numero, String nombre, String link){
        super(nombre, numero);
        this.link = link;
    }

    private String link;

    //Redefinicion
    @Override
    public void reproducir(){
        System.out.println("Reproduciendo websodio del link " + this.link);
    }


  public String getLink(){
      return this.link;
    }
  public void setLink(String link){
      this.link = link;   
    }









}
