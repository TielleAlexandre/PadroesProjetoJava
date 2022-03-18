package builder_exemplo1;

public class CasaBuilder implements Builder {

	private Casa casa;

	@Override
	public void setParedes(String tipoParede) {
		this.casa.setTipoParede(tipoParede);
		
	}

	@Override
	public void setTelhado(Telhado telhado) {
		this.casa.setTelhado(telhado);
		
	}

	@Override
	public void setAcabamento(Acabamento acabamento) {
		this.casa.setAcabamento(acabamento);
		
	}

	// O método reset limpa o objeto sendo construído.
	@Override
	public void reset() {
		this.casa = new Casa();
		
	}

	 // Builders concretos devem fornecer seus próprios
	 // métodos para recuperar os resultados.
	@Override
	public Casa getCasa() {
	 return this.casa;
	}
	
	
}
