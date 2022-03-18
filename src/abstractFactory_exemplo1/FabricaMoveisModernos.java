package abstractFactory_exemplo1;

public class FabricaMoveisModernos implements MoveisFactory {

	@Override
	public Cadeira criarCadeira() {
		return new CadeiraModerna();		
	}

	@Override
	public Sofa criarSofa() {
		return null;
	}

}
