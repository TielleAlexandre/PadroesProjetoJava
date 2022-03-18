package factoryMethod_exemplo1;

public class FabricaCaminhao extends FabricaTransporte {

	@Override
	public Transporte criarTransporte() {
		return new Caminhao();
	}

	@Override
	public float calcularTransporte(float km) {
		this.valorFrete = km*280;
		return this.valorFrete;
	}

}
