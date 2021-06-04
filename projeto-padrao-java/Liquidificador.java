public class Liquidificador extends TomadaABNT implements IAparelho{
  boolean status=false;

  TomadaABNT tomada = new TomadaABNT();
  
    public boolean getligado(){
      return status;
    };

    public void setligado(boolean bool){
        l=bool;
        System.out.print("O Liquidificador esta ");
        tomada.testeLigado(bool);
    };

}