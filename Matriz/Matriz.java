public class Matriz {
  private int matriz[][];
  private int filas;
  private int columnas;

  public Matriz(){
    this.filas = 8;
    this.columnas = 8;
    this.matriz = new int[filas][columnas];
    rellenarMatriz(0);
  }

  public Matriz(String funcion){
    this.filas = 8;
    this.columnas = 8;
    this.matriz = new int[filas][columnas];
    if(funcion == "fila") rellenarMatrizFila(-1);
    if(funcion == "columna") rellenarMatrizColumna(0);
    //if(funcion == "posicion") rellenarMatrizPosicion(0);
  }

  public Matriz(int filas, int columnas){
    this.filas = filas;
    this.columnas = columnas;
    this.matriz = new int[filas][columnas];
  }

  public void rellenarMatrizFila(int numero){
    for(int i = 0; i < this.filas; i++){
      numero +=1;
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = numero;
      }
    }
  }

  public void rellenarMatrizColumna(int numero){
    for(int i = 0; i < this.columnas; i++){
      for(int j = 0; j < this.filas; j++){
        this.matriz[j][i] = numero;
      }
      numero +=1;
    }
  }

  public void rellenarMatriz(int numero){
    for(int i = 0 ; i < this.filas ; i++){
      for (int j = 0; j < this.columnas; j ++){
        this.matriz[i][j] = numero;
      }
    }
  }

  public void lineaHorizontal(){
    for (int i = 0; i < this.columnas; i++){
      System.out.print("==");
    }
    System.out.println("=");
  }
  public void imprimir(){
    lineaHorizontal();
    lineaHorizontal();
    for(int i = 0; i < this.filas; i++){
      System.out.print("|");
      for(int j = 0; j < this.columnas; j ++){
        System.out.print(this.matriz[i][j]);
        System.out.print("|");
      }
      System.out.println();
      lineaHorizontal();
      lineaHorizontal();
    }
  }
}
