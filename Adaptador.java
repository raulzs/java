class Adaptador{
  private int entrada;
  private int salida;
  private int puertos;

  public Adaptador(){
    this.entrada = 32;
    this.salida = 12;
    this.puertos = 2;
  }

  public Adaptador(int entrada, int salida, int puertos){
    this.entrada = entrada;
    this.salida = salida;
    this.puertos = puertos;
  }
//Set
  public void setEntrada(int entrada){
    this.entrada = entrada;
  }

  public void setSalida(int salida){
    this.salida = salida;
  }

  public void setPuertos(int puertos){
    this.puertos = puertos;
  }
//Get
  public int getEntrada(){
    return this.entrada;
  }

  public int getSalida(){
    return this.salida;
  }

  public int getPuertos(){
    return this.puertos;
  }

  public String toString(){
    return "Especificaciones del Adaptador\nPotencia de  Entrada: " + this.entrada + "\nPotencia de Salida: " + this.salida + "\nNumero de Puertos: " + this.puertos;
  }

}
