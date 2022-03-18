package singleton;

public class Aplicacao {

	public static void main(String[] args) {
		System.out.println("CLASSE SINGLETON....");
		
		Singleton sin = Singleton.getInstancia();
		System.out.println(sin.toString());
		
		

	}

}
