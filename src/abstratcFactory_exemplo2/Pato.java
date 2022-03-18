package abstratcFactory_exemplo2;

public class Pato implements Animal{
    @Override
    public String getAnimal() {
        return "Pato";
    }

    @Override
    public String fazSom() {
        return "Quac";
    }
}
