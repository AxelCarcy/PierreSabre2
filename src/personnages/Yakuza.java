package personnages;

public class Yakuza extends Humain{

	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFav, int argentPossede, String clan, int reputation) {
		super(nom, boissonFav, argentPossede);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		argentPossede += victime.getArgentPossede();
		parler("J'ai piqué les " + victime.getArgentPossede() + " sous de " + victime.getNom() + ", ce qui me fait " + argentPossede + " sous dans ma poche. Hi! Hi!");
	}
}
