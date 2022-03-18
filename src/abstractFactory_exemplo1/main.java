package abstractFactory_exemplo1;

public class main {

	public static void main(String[] args) {
		// criar moveis vitorianos
        MoveisFactory fabrica = new FabricaMoveisModernos();
        Aplicacao app = new Aplicacao(fabrica);
   	     app.criarCadeira();
   	    System.out.println(app.sentar());

	}

}
