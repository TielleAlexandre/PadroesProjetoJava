package abstratcFactory_exemplo2;

public class CorFactory implements AbstractFactory<Cor>{

    @Override
    public Cor criar(String tipo) {
        if("Marrom".equalsIgnoreCase(tipo)) {
            return new Marrom();
        } else if("Preto".equalsIgnoreCase(tipo)) {
            return new Preto();
        } else if("Branco".equalsIgnoreCase(tipo)) {
            return new Branco();
        }
        return null;
    }
}
