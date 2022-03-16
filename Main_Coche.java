import java.util.Scanner;

class Main_Coche{
	public static void main(String[]args){
		Motor miMotor = new Motor();
		Ventana miVentana = new Ventana();
		Puerta miPuerta = new Puerta();
		Coche miCoche = new Coche();
		Ventana ventanaDerCoche = new Ventana();
		Scanner teclado = new Scanner(System.in);
		int preguntar;

		/** System.out.println(miCoche);
//Ver, como esta la ventana de la puerta derecha:
System.out.println(miCoche.getPuertaD().getVentana());

//Ver como esta el motor:
System.out.println(miCoche.getMotor());

//Ver como esta la puerta derecha:
System.out.println(miCoche.getPuertaD());

//Ver como se abre la puerta derecha:
miCoche.getPuertaD().abrir();
System.out.println(miCoche.getPuertaD());

//Queremos trabajar con la ventana derecha: Es más cómoda si la guardamos en una variable.
ventanaDerCoche = miCoche.getPuertaD().getVentana();
ventanaDerCoche.abrir();
System.out.println(ventanaDerCoche);
ventanaDerCoche.cerrar();
System.out.println(ventanaDerCoche);
*/

			  // Segundo, abrimos ambas puertas
      //  miCoche.getPuertaD().abrir();
        // Tercero, abrimos ambas ventanas
      //  miCoche.getPuertaI().getVentana().abrir();
				//System.out.println(miCoche);
//*

System.out.println(miCoche);

System.out.println("\nElige cual de las puertas de nuestro coche abrir\nEscribiendo un numero del 1 al 4 siguiendo el siguiente esquema:\n\nPuerta Delantera Izquierda: 1\nPuerta Delantera Derecha: 2\nPuerta Trasera Izquierda: 3\nPuerta Trasera Derecha: 4\n\nPuerta: ");
preguntar = teclado.nextInt();

miCoche.abrirPuerta(preguntar);

System.out.println(miCoche);

System.out.println("\nElige cual de las ventanas de nuestro coche abrir\nEscribiendo un numero del 1 al 4 siguiendo el siguiente esquema:\n\nVentana Delantera Izquierda: 1\nVentana Delantera Derecha: 2\nVentana Trasera Izquierda: 3\nVentana Trasera Derecha: 4\n\nVentana: ");
preguntar = teclado.nextInt();

miCoche.abrirVentana(preguntar);

System.out.println(miCoche);

	}
}
