package abstratcFactory_exemplo2;

public class FactoryProvider {

    public static AbstractFactory getFactory(String escolha) {
        if("Animal".equalsIgnoreCase(escolha)) {
            return new AnimalFactory();
        } else if("Cor".equalsIgnoreCase(escolha)) {
            return new CorFactory();
        }

        return null;
    }
}
