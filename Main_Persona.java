import java.util.ArrayList;
class Main_Persona{
public static void main(String[] args){
  Persona miPersona = new Persona();
  Alumno alumnoDefecto = new Alumno();
  Alumno miAlumno = new Alumno("Marivi", "98712345k","ASD");
  Profesor miProfesor = new Profesor("celia","87645678L", 2500, 34567643);

  System.out.println(miAlumno);
  System.out.println(alumnoDefecto);
  System.out.print(miProfesor);
  //System.out.println(miPersona);
  //Poner los gets

   ArrayList<Integer> lista = new ArrayList();
   lista.add(4);
   lista.add(5);
   System.out.println(lista);

   ArrayList<Alumno> listaAlumno = new ArrayList();
   listaAlumno.add(miAlumno);
   listaAlumno.add(alumnoDefecto);
   System.out.println(listaAlumno);
   System.out.println(listaAlumno.get(0).getNombre());
 }
}
