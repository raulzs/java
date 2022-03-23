public class Tablero{
  private String matriz[][];
  private int filas;
  private int columnas;
  public Ficha matrizExt;

  public Tablero(){
    this.filas = 3;
    this.columnas = 3;
    this.matriz = new String[filas][columnas];
    this.matrizExt = new Ficha();
    if (matrizExt.getForma().contains("X")) rellenarMatrizX("X");
    if (matrizExt.getForma().contains("O")) rellenarMatrizXO();

  }

  public Tablero(String ficha){
    this.filas = 3;
    this.columnas = 3;
    this.matriz = new String[filas][columnas];
    this.matrizExt = new Ficha(ficha);
    if (matrizExt.getForma().contains("X")) rellenarMatrizX("X");
    if (matrizExt.getForma().contains("O")) rellenarMatrizXO();

  }

  public void rellenarMatrizX(String forma){
    for(int i = 0; i < this.filas; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = forma;
      }
    }
  }

  public void rellenarMatrizXO(){
    int contador = 3;
    for(int i = 0; i < this.filas; i++){
      for (int j = 0; j < this.columnas; j++){
        if(contador % 2 == 1){
        this.matriz[j][i] = "X";
      } else if (contador % 2 == 0){
        this.matriz[i][j] = "O";
      }
      contador+=1;
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
