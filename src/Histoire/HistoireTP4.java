package Histoire;

import Personnages.Humain;

public class HistoireTP4 {
	public static void main (String[] args)
	{
		Humain prof = new 
				Humain ("prof", "Kombucha", 54);
		 
		prof.parler("Bonjour je m'appelle "+ prof.getNom()+ " et j'aime boire du " + prof.getBoissonfavo());
		System.out.println("(" + prof.getNom()+ ") - J'ai " + prof.getArgent()+ " sous en poche, je vais pouvoir m'offrir qqch");
				
	}

}
