class Main{
	public static void main(String[]args){
		Motor miMotor = new Motor();
		Puerta miPuerta = new Puerta();
		Coche miCoche = new Coche();

		System.out.println(miPuerta.getEstado());


		System.out.println(miPuerta.getVentana().getEstado());

		System.out.println(miMotor);

		miMotor.encender();

		System.out.println(miMotor);


		System.out.println(miVentana);

		miVentana.abrir();

		System.out.println(miVentana);


		miPuerta.getVentana().abrir();

		System.out.println(miPuerta);


        // Primero, encendemos el motor
        miCoche.getMotor().encender();
        // Segundo, abrimos ambas puertas
        miCoche.getPuertaI().abrir();
        miCoche.getPuertaD().abrir();
        // Tercero, abrimos ambas ventanas
        miCoche.getPuertaI().getVentana().abrir();
        miCoche.getPuertaD().getVentana().abrir();


		System.out.println(miCoche);



	}
}
