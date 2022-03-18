package factoryMethod_exemplo1;

public class Navio implements Transporte{

	@Override
	public void entregarProduto_Tempo_Normal() {
		System.out.println("Vai entregar em tempo normal: 12 dias úteis");		
	}

	@Override
	public void entregarProduto_Tempo_Express() {
		System.out.println("Vai entregar em tempo express: 8 dias úteis");
		
	}

}
