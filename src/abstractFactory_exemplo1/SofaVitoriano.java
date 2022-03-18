package abstractFactory_exemplo1;

public class SofaVitoriano implements Sofa {

	@Override
	public String sentar() {
		return "Sentei no sofá vitoriano.";
	}

	@Override
	public String mover() {
		return "Movi o sofá vitoriano";
	}

}
