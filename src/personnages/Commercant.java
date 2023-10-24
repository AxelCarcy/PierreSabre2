package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonFav, int argentPossede) {
		super(nom, boissonFav, argentPossede);
	}
	
	public void seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste... ");
		argentPossede = 0;
	}

	public void recevoir(int argentRecu) {
		parler(argentRecu + " sous ! Je te remercie généreux donateur! ");
		argentPossede += argentRecu;
	}

	
	

}
