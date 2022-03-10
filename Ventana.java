    class Ventana{
    //atributos

	private boolean estado;
	
    //constructores

	public Ventana(){
	this.estado = false;
	}

    //get-coger

	public boolean getEstado(){
		return this.estado;
	}

    //set
    //puede estar privado, aunque normalmente es publica

    private void setEstado(boolean estado){
    	 this.estado = estado;
    }

    //funcion abrirla o cerrarla

	public void  abrir(){
		this.setEstado(true);
	}

	public void cerrar(){
		this.setEstado(false);
	}

	public String toString(){
	String resultado = "Ventana : Cerrada";
	if (this.estado == true){
    resultado = "Ventana : Abierta";
    }

    return resultado;

	}
}