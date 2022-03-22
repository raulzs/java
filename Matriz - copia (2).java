public class Matriz {
  private int matriz[][];
  private int filas;
  private int columnas;

  public Matriz(){
    this.matriz = new int[2][2];
    this.matriz.rellenarMatriz(0);
  }

  public Matriz(int filas, int columnas){
    this.filas = filas;
    this.columnas = columnas;
    this.matriz = new int[filas][columnas];
  }

  public void rellenarMatriz(int numero){
    for(int i = 0 ; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j ++){
        this.matriz[i][j] = numero;
      }
    }
  }
}
