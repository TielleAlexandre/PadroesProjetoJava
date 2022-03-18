package abstractFactory_exemplo1;

public class CadeiraVitoriana implements Cadeira {

	@Override
	public boolean temPernas() {
		return true;
	}

	@Override
	public boolean possuiBraco() {
		return true;
	}

	@Override
	public String sentar() {
		return "Sentei em uma cadeira vitoriana estofada e quentinha";
	}

}
