package abstratcFactory_exemplo2;

public class Gato implements Animal{
    @Override
    public String getAnimal() {
        return "Gato";
    }

    @Override
    public String fazSom() {
        return "Miau!";
    }
}
