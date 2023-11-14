package Personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza( String nom, String boissonfavo, int argent, String clan) {
		super(nom, boissonfavo, argent);
		this.clan= clan;
		this.reputation=0;
		
		public void etorquer(Commer�ant victime) {
			int montantEtorque =  victime.seFaireExtorquer();
			gagnerArgent(montantEtorque);
			this.reputation+= 1 ;
			parler("J'ai extorqu� "+ montantEtorque+ "d'unit�s d'argent du commer�ant et ma reputation est de "+ this.reputation);
			
			
		}
	}
	

}
