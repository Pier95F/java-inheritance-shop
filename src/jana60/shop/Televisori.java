package jana60.shop;

public class Televisori extends Prodotto {
	
	// Definisco gli attributi
	
	private int dimensioni;
	private boolean smart;
	
	// Costruttori
	
	public Televisori(int codice, String nome, String marca, double prezzo, double iva, int dimensioni, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.smart = smart;
		}

	// Imposto i getters e i setters
	
	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	
	// Imposto il metodo per determinare se la tv è smart oppure no
	
	private String televisoreSmart() {
		if (smart) {
			return "- smart tv";
		} else {
			return "- no smart";
		}
	}
	
	
	// Override
	public String toString() {
		String stringaTelevisore = super.toString() + " - " + dimensioni;
		if (smart) {
			stringaTelevisore += " - smart tv";
		} return stringaTelevisore;
	}
	
	
	
	

}
