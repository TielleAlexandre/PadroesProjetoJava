package builder_exemplo1;

public class Diretor {
	
	private Builder builder;
	
	
	// O diretor trabalha com qualquer instância builder que
    // o código cliente passar a ele.
	public void setBuilder (Builder builder) {
		this.builder= builder;
	}
	
	// O diretor pode construir diversas variações do produto
    // usando as mesmas etapas de construção.
	public void construirCasaModerna() {
		this.builder.reset();
		this.builder.setParedes("Parede de vidro.");
		Acabamento acabamento = new Acabamento();
		acabamento.setCor("azul");
		acabamento.setMetragem(110);
		acabamento.setTipo("mármore");
		this.builder.setAcabamento(acabamento);
		this.builder.setTelhado(Telhado.VIDRO);
	}
	
	
	public void construirCasaMadeira() {
		this.builder.reset();
		this.builder.setParedes("Parede de Madeira.");
		Acabamento acabamento = new Acabamento();
		acabamento.setCor("verde");
		acabamento.setMetragem(80);
		acabamento.setTipo("ladrilho");
		this.builder.setAcabamento(acabamento);
		this.builder.setTelhado(Telhado.MADEIRA);
	}

	
	
	
}
