package jana60.shop;

public class Main {

	public static void main(String[] args) {
		
		/* Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto e testate le funzionalità delle vostre classi in una classe Main con metodo main. */
		
		Smartphone telefono = new Smartphone (145, "S7", "Samsung", 150.00, 0.22, "86475533", "8 GB");
		Televisori tv = new Televisori (740, "BRAVIA KD", "Sony", 450.50, 0.22, 40);
		Cuffie cuffia = new Cuffie (37, "Dr. Dre II", "Beats", 115.00, 0.22, "Rosso");
		
		System.out.println(telefono.toString());
		System.out.println(tv.toString());
		System.out.println(cuffia.toString());
	}

}
