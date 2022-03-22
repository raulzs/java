import java.util.Scanner;
import java.util.ArrayList;

class Main_Cargador{
  public static void main(String[]args){
    System.out.println("Rauul Zamora Sancho");
    Scanner Teclado = new Scanner(System.in);
    Cargador cargadorMovil = new Cargador();
    ArrayList<String> listaCables = new ArrayList<String>();
    ArrayList<Boolean> listaCablesUSBData = new ArrayList<Boolean>();
    int longitud;
    String entrada;
    String salida;
    boolean usb;
    int entradaPotencia;
    int salidaPotencia;
    int puertos;

    System.out.println("Introduce la entrada del cable: ");
    entrada = Teclado.nextLine();
    System.out.println("Introduce la salida del cable: ");
    salida = Teclado.nextLine();
    System.out.println("Permite transferencia de datos por USB? (true/false): ");
    usb = Teclado.nextBoolean();
    System.out.println("Introduce la longitud: ");
    longitud = Teclado.nextInt();

    listaCables.add(entrada);
    listaCablesUSBData.add(usb);

    System.out.print("Introduce la potencia de entrada del cargador: ");
    entradaPotencia = Teclado.nextInt();
    System.out.print("Introduce la potencia de salida del cargador: ");
    salidaPotencia = Teclado.nextInt();
    System.out.print("Introduce el numero de puertos que tiene el cargador: ");
    puertos = Teclado.nextInt();

    cargadorMovil = new Cargador(longitud,entrada,salida,usb,entradaPotencia,salidaPotencia,puertos);
    System.out.println(cargadorMovil);

    cargadorMovil.getAdaptadorCargador().setPuertosDisponibles(listaCables);

    if(cargadorMovil.getAdaptadorCargador().getPuertosDisponibles() > 0){
      System.out.println("\nPuertos disponibles para conectar un cable: " + cargadorMovil.getAdaptadorCargador().getPuertosDisponibles() + "puertos");
    }

    cargadorMovil.getCableCargador().CablesUtiles(listaCables, listaCablesUSBData);


  }
}
