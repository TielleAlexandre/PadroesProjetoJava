package builder_exemplo1;

public class Aplicação {

	public static void main(String[] args) {
		
		Diretor diretor = new Diretor();
		
		CasaBuilder casaBuilder = new CasaBuilder();
		diretor.setBuilder(casaBuilder);
		diretor.construirCasaModerna();
		Casa casaModerna = casaBuilder.getCasa();
		
		System.out.println("Casa moderna: " + casaModerna.getTelhado());
		
		casaBuilder.reset();
		diretor.construirCasaMadeira();
		Casa casaMadeira = casaBuilder.getCasa();
		
		System.out.println("Casa madeira: " + casaMadeira.getTelhado());
		
				
		

	}

}
