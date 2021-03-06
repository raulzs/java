class Coche{
	private Motor motorCoche;
	private Puerta puertaIzquierda;
	private Puerta puertaDerecha;
	private Puerta puerta_Trasera_Izquierda;
	private Puerta puerta_Trasera_Derecha;

	public Coche(){
		this.motorCoche = new Motor();
		this.puertaIzquierda = new Puerta();
		this.puertaDerecha = new Puerta();
		this.puerta_Trasera_Izquierda = new Puerta();
		this.puerta_Trasera_Derecha = new Puerta();
	}

	public Puerta getPuertaI(){
		return this.puertaIzquierda;
	}

	public Puerta getPuertaD(){
		return this.puertaDerecha;
	}

	public Puerta getPuertaTI(){
		return this.puerta_Trasera_Izquierda;
	}

	public Puerta getPuertaTD(){
		return this.puerta_Trasera_Derecha;
	}

//Cambiar los gets.
	public void abrirPuerta(int numero){
		if (numero == 1){
			this.puertaIzquierda.abrir();
		}

		if (numero == 2){
			this.puertaDerecha.abrir();
		}

		if (numero == 3){
			this.puerta_Trasera_Izquierda.abrir();
		}

		if (numero == 4){
			this.puerta_Trasera_Derecha.abrir();
		}

		else if (numero >=5 || numero >1){
			System.out.println("\nPuerta no existente");
		}
	}

	public void abrirVentana(int numero){
		if (numero == 1){
			this.puertaIzquierda.getVentana().abrir();
		}

		if (numero == 2){
			this.puertaDerecha.getVentana().abrir();
		}

		if (numero == 3){
			System.out.println("\nError esta ventana no se puede abrir");
		}

		if (numero == 4){
				System.out.println("\nError esta ventana no se puede abrir");
		}

		else if (numero >=5 || numero >1){
			System.out.println("\nVentana no existente");
		}
	}




	public String toString(){
		return motorCoche + "\n"  + "PuertaI:| " + puertaIzquierda + "|" + "\n" + "PuertaD:| " + puertaDerecha + "|" + "\n" + "Puerta Trasera Izquierda: |" + this.puerta_Trasera_Izquierda +"|" + "\n" + "puerta_Trasera_Derecha: |" + this.puerta_Trasera_Derecha;
	}

}
