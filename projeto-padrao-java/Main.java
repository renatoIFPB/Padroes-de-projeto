public class Main {

	public static void main(String args[]) {
    IAparelho a = new Liquidificador();

    a.setligado(true);
    a.setligado(false);
    a = new Lavadoura();
    a.setligado(true);
    a.setligado(false);
	}

}