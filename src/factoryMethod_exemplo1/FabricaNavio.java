package factoryMethod_exemplo1;

public class FabricaNavio extends FabricaTransporte {

	@Override
	public Transporte criarTransporte() {
		return new Navio();
	}

	@Override
	public float calcularTransporte(float km) {
		return this.valorFrete=km*450;		
	}

}
