public class Profesor extends Persona{
  private double sueldo;
  private int numSs;

  public Profesor(){
    super();
    this.sueldo = 1700;
}
  public Profesor(String nombre, String dni, double sueldo, int numSs){
    super(nombre, dni);
    this.sueldo = sueldo;
    this.numSs = numSs;
  }

  public String toString(){
    return super.toString() + "Su sueldo es de: " + this.sueldo + this.numSs + ".";
  }
  
}
