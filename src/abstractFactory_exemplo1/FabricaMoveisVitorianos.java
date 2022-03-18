package abstractFactory_exemplo1;

public class FabricaMoveisVitorianos implements MoveisFactory {

	@Override
	public Cadeira criarCadeira() {
		return new CadeiraVitoriana();
	}

	@Override
	public Sofa criarSofa() {
		return new SofaVitoriano();
	}

}
