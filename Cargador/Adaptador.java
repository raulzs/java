import java.util.Scanner;
import java.util.ArrayList;

class Adaptador{
  private int entrada;
  private int salida;
  private int puertos;
  private int puertos_disponibles;
  private Scanner Teclado = new Scanner(System.in);
  private int preguntar;

  public Adaptador(){
    this.entrada = 32;
    this.salida = 12;
    this.puertos = 2;
    this.puertos_disponibles = puertos;
  }

  public Adaptador(int entrada, int salida, int puertos){
    this.entrada = entrada;
    this.salida = salida;
    this.puertos = puertos;
    this.puertos_disponibles = puertos;
    if (puertos > 2) limitarPuertos(puertos);
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

  public void limitarPuertos(int puerto){
    while (this.puertos > 2){
      System.out.println("\nIntroduce otro numero de puertos inferior a 2: ");
      preguntar = Teclado.nextInt();
      this.puertos = preguntar;
      this.puertos_disponibles = preguntar;
    }

    }

  public void setPuertosDisponibles(ArrayList<String>listaCables){
    for (int i = 0; i < listaCables.size(); i++){
      this.puertos_disponibles-=1;
  }
  }

    public int getPuertosDisponibles(){
      return this.puertos_disponibles;
    }

  public String toString(){
    return "Especificaciones del Adaptador\nPotencia de  Entrada: " + this.entrada + "\nPotencia de Salida: " + this.salida + "\nNumero de Puertos: " + this.puertos;
  }

}
