package factoryMethod_exemplo1;

public class Caminhao implements Transporte {

	@Override
	public void entregarProduto_Tempo_Normal() {
		System.out.println("Vai entregar em tempo normal: 25 dias úteis");
		
	}

	@Override
	public void entregarProduto_Tempo_Express() {
		System.out.println("Vai entregar em tempo normal: 18 dias úteis");
		
	}

}
