import java.util.Arraylist;
public class Cable{
  private float longitud;
  private String entrada;
  private String salida;
  private boolean USB_data;


  public Cable(){
    this.longitud = 4;
    this.entrada = "USB_A";
    this.salida = "USB_C";
    this.USB_data = true;
  }

  public Cable (float longitud, String entrada, String salida, boolean USB){
    this.longitud = longitud;
    this.entrada = entrada;
    this.salida = salida;
    this.USB_data = USB;
  }

//Set
  public void setLongitud (float longitud){
    this.longitud = longitud;
  }

  public void setEntrada(String entrada){
    this.entrada = entrada;
  }

  public void setSalida(String salida){
    this.salida = salida;
  }

  public void setDatos(boolean USB){
    this.USB_data = USB;
  }

//Get
  public float getLongitud(){
    return this.longitud;
  }

  public String getEntrada(){
    return this.entrada;
  }

  public String getSalida(){
    return this.saida;
  }

  public boolean getUSBDATA(){
    return this.USB_data;
  }

  public void CablesUtiles(ArrayList<String> listaCables, ArrayList<Boolean> listaCablesUSBData){
    for(int i = 0; i < listaCables.size(); i++){
      if(listaCables.get(i).contains("microUSB")&& listaCablesUSBData.get(i)==true){
        System.out.println("uno de los cables conectados transfiere datos USB");
      }
    }
  }

  public String toString(){
    return "\n\n Carecteristicas cable\n" + "Longitud: " + this.longitud + "\nTipo Entrada: " + this.entrada + "\nTipo Salida":  + this.salida + "\nTransferencia de datos USB? " + this.USB_data;
  }


}
