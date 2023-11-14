package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFav, int argentPossede, String clan, int reputation) {
		super(nom, boissonFav, argentPossede);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		argentPossede += victime.getArgentPossede();
		parler("J'ai piqué les " + victime.getArgentPossede() + " sous de " + victime.getNom() + ", ce qui me fait " + argentPossede + " sous dans ma poche. Hi! Hi!");
		victime.seFaireExtorquer();
		
	}
	
	public int perdre() {
		parler("J'ai perdu mon duel et mes " + argentPossede + " sous, snif... J'ai déshonoré le clan de "+ clan +".");
		int argentPerdu = argentPossede;
		argentPossede = 0;
		reputation -= 1;
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre "+ super.getNom() + " du clan de " + clan + "? Je l'ai dépouillé de ses " + gain + " sous.");
		reputation += 1;
	}
}
