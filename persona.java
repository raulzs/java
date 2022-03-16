// Clase persona Herencia
// Dos tipos de herencia: extension(a los metodos del padre le añadimos metodos propios)
// y especialización(modificamos los metodos del padre para adapatarlo a nuestras necesidades)
// A demás de la herencia por agregación o composicion (añadir clases como atri-)
// butos de nuestra clase) explicado en coche.

public class Persona{
  private String nombre;
  private String dni;

  //CONSTRUCTOR
  public Persona(){
    this.nombre = "Raul";
    this.dni = "12345678C";
  }
  public Persona(String nombre, String dni){
    this.nombre = nombre;
    this.dni = dni;
  }

  //GET
  public String getNombre(){
    return this.nombre;
  }
  public String getDni(){
    return this.dni;
  }

  //SET
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setDni(String dni){
    this.dni = dni;
  }

  public String toString(){
    return "Me llamo " + this.nombre + " y mi dni es " + this.dni + ".";
  }
}
