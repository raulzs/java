class Coche{
	private Motor motorCoche;
	private Puerta puertaIzquierda;
	private Puerta puertaDerecha;

	public Coche(){
		this.motorCoche = new Motor();
		this.puertaIzquierda = new Puerta();
		this.puertaDerecha = new Puerta();
	}

	public Puerta getPuertaI(){
		return this.puertaIzquierda;
	}

	public Puerta getPuertaD(){
		return this.puertaDerecha;
	}

	public String toString(){
		return motorCoche +"|"  + "PuertaI:{ " + puertaIzquierda + "}" + "|" + "PuertaD:{ " + puertaDerecha + "}";
	}

}