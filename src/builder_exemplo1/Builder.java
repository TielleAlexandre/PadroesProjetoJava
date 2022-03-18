package builder_exemplo1;

public interface Builder {

    void setParedes(String tipoParede);
    void setTelhado(Telhado telhado);
    void setAcabamento(Acabamento acabamento);	
	void reset();
	Casa getCasa();
   
	
}
