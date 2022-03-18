public class Planta{
  private String nombre_comun;
  private String nombre_cientifico;
  private String clima;
  private String habitat;
  private float altura;
  private boolean semillas;

  public Planta(){
    this.nombre_comun = "Astragalus";
    this.nombre_cientifico = "Astragalus membramaceus";
    this.clima = "Alpino";
    this.habitat = "Montaña";
    this.altura = 20;
    this.semillas = false;
  }

  public Planta(String nombre_comun, String nombre_cientifico, String clima, String habitat, Float altura, boolean semillas){
    this.nombre_comun = nombre_comun;
    this.nombre_cientifico = nombre_cientifico;
    this.clima = clima;
    this.habitat = habitat;
    this.altura = altura;
    this.semillas = semillas;
}
    //Set

    public void setNombreComun(String nombre_comun){
      this.nombre_comun = nombre_comun;
    }

    public void setNombreCientifico(String nombre_cientifico){
      this.nombre_cientifico = nombre_cientifico;
    }

    public void setClima(String clima){
      this.clima = clima;
    }

    public void setHabitat(String habitat){
      this.habitat = habitat;
    }

    public void setAltura(Float altura){
      this.altura = altura;
    }

    public void setSemillas(boolean semillas){
      this.semillas = semillas;
    }

    //Get

    public String getNombre_Cientifico(){
      return this.nombre_cientifico;
    }

    public String getNombreComun(){
      return this.nombre_comun;
    }

    public String getClima(){
      return this.clima;
    }

    public String getHabitat(){
      return this.habitat;
    }

    public Float getAltura(){
      return this.altura;
    }

    public boolean getSemillas(){
      return this.semillas;
    }

    public String toString(){
      return "Resumen de planta:\nNombre:  " + this.nombre_comun + "\nNombre cientifico:  " + this.nombre_cientifico + "\nClima: " + this.clima + "\nHabitat: " + this.habitat + "\nAltura: " + this.altura + "\n¿Tiene semillas?: " + this.semillas;
    }
}
