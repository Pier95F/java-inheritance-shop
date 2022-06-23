package jana60.shop;

public class Smartphone extends Prodotto {

	
	// Definisco gli attributi
	
	private String imei;
	private String memoria;
	
	// Costruttori 
	
	public Smartphone(int codice, String nome, String marca, double prezzo, double iva, String imei, String memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.imei = imei;
		this.memoria = memoria;		
	}
	
	// Imposto i getters e i setters

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	
	// Override
	public String toString () {
		return super.toString() + ", codice IMEI: " + imei + ", memoria interna: " + memoria;
	}	

	
	
	

}
