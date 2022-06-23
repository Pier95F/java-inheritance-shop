package jana60.shop;

public class Televisori extends Prodotto {
	
	// Definisco gli attributi
	
	private int dimensioni;
	private boolean smart;
	
	// Costruttori
	
	public Televisori(int codice, String nome, String marca, double prezzo, double iva, int dimensioni) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
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
			return " - smart tv";
		} else {
			return " - no smart";
		}
	}
	
	
	// Override
	public String toString() {
		return super.toString() + ", dimensioni: " + dimensioni + " pollici" + televisoreSmart();
	}
	}
	
	
	
	


