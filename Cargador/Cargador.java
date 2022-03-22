public class Cargador{
  private Cable cableCargador;
  private Adaptador adaptadorCargador;

  public Cargador(){
		this.cableCargador = new Cable();
		this.adaptadorCargador = new Adaptador();
	}

  public Cargador(float longitud, String entrada, String salida, boolean USB, int entradaPotencia,int salidaPotencia, int puerto){
    this.cableCargador = new Cable(longitud, entrada, salida, USB);
    this.adaptadorCargador = new Adaptador(entradaPotencia, salidaPotencia, puerto);
	}

  public Cable getCableCargador(){
    return this.cableCargador;
  }

  public Adaptador getAdaptadorCargador(){
    return this.adaptadorCargador;
  }

  public String toString(){
    return "Caracteristicas Cargador \n\n" + adaptadorCargador + cableCargador;
  }
}
