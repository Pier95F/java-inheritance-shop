package jana60.shop;

public class Cuffie extends Prodotto {
	
	// Definisco gli attributi
	
	private String colore;
	private boolean wireless;
	
	// Costruttori
	
	public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
	}

	// Imposto i getters e i setters
	
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	
	// Imposto il metodo per determinare se le cuffie sono wireless o cablate
	
	private String tipologiaCuffie() {
		if (wireless) {
			return " - wireless";
		} else {
			return " - cablate";
		}
	}
	
	// Override
	
	public String toString() {
		return super.toString() + ", colore: " + colore + tipologiaCuffie();
	}
	
	
	
	

}
