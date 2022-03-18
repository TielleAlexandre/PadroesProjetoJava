package abstratcFactory_exemplo2;

public interface AbstractFactory<T> {

    T criar(String tipo);
}
