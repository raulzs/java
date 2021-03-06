import java.util.Scanner;
import java.util.Arraylist;

class Adaptador{
  private int entrada;
  private int salida;
  private int puertos;
  private int puertosDisponibles;
  private Scanner Teclado = new Scanner(System.in);
  private int preguntar;

  public Adaptador(){
    this.entrada = 32;
    this.salida = 12;
    this.puertos = 2;
    this.puertosDisponibles = puerto;
  }

  public Adaptador(int entrada, int salida, int puertos){
    this.entrada = entrada;
    this.salida = salida;
    this.puertos = puertos;
    this.puertosDisponibles = puerto;
    if (puerto > 2) limitarPuertos(puerto);
  }

  public void limitarPuertos(int puerto){
    while(this.puertos > 2){
      System.out.println("Numero de puertos: " this.puertos +"\nSuperior al maximo: 2\Introduce otro valor");
      preguntar = Teclado.nextInt();
      this.puertos = preguntar;
      this.puertosDisponibles = preguntar;
    }
  }

  public void setPuertosDisponibles(Arraylist<String>listaCables){
    for(int i = 0; i < listaCables.size(); i++){
      this.puertosDisponibles-=1;
    }
  }
  public int getPuertosDisponibles(){
    return this.puertosDisponibles;
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
