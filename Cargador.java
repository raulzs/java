public class Cargador{
  private Cable cableCargador;
  private Adaptador adaptadorCargador;

  public Cargador(){
		this.cableCargador = new Cable();
		this.adaptadorCargador = new Adaptador();
	}

  public Adaptador getAdaptador(){
		return this.adaptadorCargador;
	}


}
