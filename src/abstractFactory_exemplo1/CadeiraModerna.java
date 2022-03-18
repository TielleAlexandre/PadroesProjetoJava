package abstractFactory_exemplo1;

public class CadeiraModerna implements Cadeira {

	@Override
	public boolean temPernas() {
	   return false;
	}

	@Override
	public boolean possuiBraco() {
		return false;
	}

	@Override
	public String sentar() {
	   return "Sentei em uma cadeira moderna não estofada.";	
	}

}
