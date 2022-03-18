package factoryMethod_exemplo1;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Baixo nível de acoplamente para acrescentar um novo objeto		
		
		FabricaTransporte fabTransporte = new FabricaNavio();
		fabTransporte.entregarProduto_Tempo_Express();
		fabTransporte.entregarProduto_Tempo_Normal();
		System.out.println("Total:" + fabTransporte.calcularTransporte(250));
		
		
		
		
	}

}
