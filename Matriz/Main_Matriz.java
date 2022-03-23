class Main_Matriz{

  public static void main(String[]args){
    Matriz matriz = new Matriz();
    System.out.println("\nMatriz por defecto: \n");
    matriz.imprimir();

    Matriz matrizfila = new Matriz("fila");
    matrizfila.imprimir();

    Matriz matrizcolumna = new Matriz("columna");
    matrizcolumna.imprimir();

    Matriz matrizposicion = new Matriz("posicion");
    matrizposicion.imprimir();

    Matriz matrizsuma = new Matriz("suma");
    matrizsuma.imprimir();

    Matriz matrizmultiplicacion = new Matriz("Multiplicacion");
    matrizmultiplicacion.imprimir();


  }
}
