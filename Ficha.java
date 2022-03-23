public class Ficha{
  private String forma;

  public Ficha(){
    this.forma = "X";
  }

  public Ficha(String forma){
    if (ficha.equals ("O") || ficha.equals ("X")){
        this.forma = ficha;
    }
  }

  public void setForma(String ficha ){
    this.forma = ficha;
  }

  public void getForma(){
    return this.forma;
  }
}
