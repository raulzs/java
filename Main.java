class Main{
	public static void main(String[]args){
		Motor miMotor = new Motor();
		Ventana miVentana = new Ventana();
		Puerta miPuerta = new Puerta();
		Coche miCoche = new Coche();
		Ventana ventanaDerCoche = new Ventana();
		System.out.println(miCoche);
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


			  // Segundo, abrimos ambas puertas
      //  miCoche.getPuertaD().abrir();
        // Tercero, abrimos ambas ventanas
      //  miCoche.getPuertaI().getVentana().abrir();
				//System.out.println(miCoche);
//*

	}
}
