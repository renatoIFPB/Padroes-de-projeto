public class Lavadoura extends TomadaABNT implements IAparelho {
    boolean status=false;

    TomadaABNT tomada = new TomadaABNT();

    public boolean getligado(){
      return status;
    };

    public void setligado(boolean bool){
      status=bool;
      System.out.print("A lavadoura esta ");
      tomada.testeLigado(bool);
      if(bool==true){
        this.lavar();
      }  
    };

    public void lavar(){
        this.limpar();
        this.Centrifugar();
        this.Enxaguar();
    }

    public void limpar(){
        System.out.println("Lavando!!!");
    }

    public void Centrifugar(){
        System.out.println("Centrifugando!!!");
    }

    public void Enxaguar(){
        System.out.println("Enxaguando!!!");
    }
}