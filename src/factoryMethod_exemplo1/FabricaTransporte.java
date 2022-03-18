package factoryMethod_exemplo1;

public abstract class FabricaTransporte {
	
	protected float valorFrete;
	protected String tipoEntrega;
	
	public abstract Transporte criarTransporte();
	public abstract float calcularTransporte(float km);

	
	//métodos implementados na classes dos tipos de produtos
	public void entregarProduto_Tempo_Normal() {
	// interface 
	   Transporte transporte = criarTransporte();
	   transporte.entregarProduto_Tempo_Normal();
	}

	
	public void entregarProduto_Tempo_Express() {
		Transporte transporte = criarTransporte();
		transporte.entregarProduto_Tempo_Express();		
	}
	

}