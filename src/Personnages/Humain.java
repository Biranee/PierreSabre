package Personnages;

public class Humain {

	public String nom;
	public String boissonfavo;
	public int argent ; 
	

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
			System.out.println(nom + "a pay�" + montant + "�"+ autre.nom +".");
		}else { 
			System.out.println(nom + " ne peut pas payer cette somme ");
		}
		
	}
	
	public void gagnerArgent (int montant) {
		if (montant >0 ) {this.argent+=montant;
		System.out.println(nom + " a gagn� " + montant + "unit�s");
		}
	}
	
	public void perdreArgent(int montant) {
		
	}
}

