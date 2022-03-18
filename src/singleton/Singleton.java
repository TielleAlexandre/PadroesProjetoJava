package singleton;

public class Singleton {
	
	
	private static Singleton sigleton;
	private String mensagem;
	
	private Singleton() {
		this.mensagem = "Oie sou...";
			
	}
	
	public static Singleton getInstancia() {
		if(Singleton.sigleton==null) {
			Singleton.sigleton = new Singleton();
		}
		return 	Singleton.sigleton;
	}
	
	@Override
	public String toString() {
		return "Oie sou uma uma única instancia.";
	}
	
	

}
