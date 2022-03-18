package abstractFactory_exemplo1;

public class Aplicacao {
	
	private MoveisFactory fabrica;
	private Cadeira cadeira;
	private Sofa sofa;
	
	public Aplicacao(MoveisFactory moveisFactory) {
		this.fabrica = moveisFactory;
	}
	
	void criarCadeira() {
		this.cadeira = fabrica.criarCadeira();
	}
	
	void criarSofa() {
		this.sofa = fabrica.criarSofa();
	}
	
	String sentar() {
		return cadeira.sentar();
		
	}
	
	
	
	
	

}
