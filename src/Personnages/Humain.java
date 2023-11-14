package Personnages;

public class Humain {

	private String nom;
	private String boissonfavo;
	private int argent ; 
	

	public Humain(String nom, String boissonfavo, int argent) {
		super();
		this.nom = nom;
		this.boissonfavo = boissonfavo;
		if (argent<0) {this.argent=0;}
		else {
		this.argent = argent;}
	}

	public void parler() {
		System.out.println("Bonjour je suis " + nom + " ma boisson favorite est " + boissonfavo + ".");
	}
	
	public void payer(Humain autre, int montant) {
		if (montant >=0 && this.argent>=montant) {
			this.argent-=montant;
			autre.argent+=montant;
			System.out.println(nom + "a payé" + montant + "à"+ autre.nom +".");
		}else { 
			System.out.println(nom + " ne peut pas payer cette somme ");
		}
		
	}
	
	public void gagnerArgent (int montant) {
		if (montant >0 ) {this.argent+=montant;
		System.out.println(nom + " a gagné " + montant + "unités");
		}
	}
	
	public void perdreArgent(int montant) {
		if (montant>0 && this.argent>=montant) {
			this.argent-= montant; 
			System.out.println(nom + "a perdu" + montant +" unités");
		} else {
			System.out.println(nom +" n'a pas assez d'argent pour perdre ça " );
		}
	} 
	
	public void direBonjour() {
		System.out.println(nom + "dit : Bonjour!");
		
	}
	public void boire() {
		System.out.println(nom + "Boit son " + boissonfavo + " favorite");
	}
	
	public void acheter(Humain vendeur, int montant) {
		if (this.argent>= montant) {
			this.argent= montant;
			vendeur.argent+= montant;
			System.out.println(nom + " a acheté quelque chose pour " + montant + "d'unités à" + vendeur.nom );
		} else {
			System.out.println( nom + " n'a pas assez d'argent pour acheter ce produit ");
		}
	}
	
	public void parler(String message) {
		System.out.println(nom +" dit :"+ message);
	}

	public String getNom() {
		return nom;
	}

	public String getBoissonfavo() {
		return boissonfavo;
	}

	public int getArgent() {
		return argent;
	}

	
	
	
}

