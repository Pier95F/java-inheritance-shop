package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {

	/* Creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
	- codice (numero intero) 
	- nome
	- marca
	- prezzo
	- iva 
	
	Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
	- il codice prodotto sia accessibile solo in lettura
	- gli altri attributi siano accessibili sia in lettura che in scrittura
	- il prodotto esponga un metodo per avere il prezzo comprensivo di iva formattato */
	
	// Costanti
	private DecimalFormat df = new DecimalFormat ("0.00€");
	
	// Definisco gli attributi
	
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;
	
	// Costruttori

	public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	// Imposto i getters e i setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}
	
	// Imposto i metodi per il calcolo del prezzo
	
	private double calcolaPrezzo() {
		return prezzo + prezzo * iva;
	}
	
	public String prezzoFormattato () {
		return df.format(calcolaPrezzo());
	}
	
	// Override
	public String toString() {
		return "Codice prodotto: " + codice + ", nome prodotto: " + nome + ", marca prodotto: " + marca + ", prezzo: " + prezzoFormattato();
	}	
	
	
	
}
