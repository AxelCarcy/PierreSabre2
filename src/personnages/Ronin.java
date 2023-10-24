package personnages;

public class Ronin extends Humain{

	private int honneur = 1;

	public Ronin(String nom, String boissonFav, int argentPossede, int honneur) {
		super(nom, boissonFav, argentPossede);
		this.honneur = honneur;
	}
	
	public int getHonneur() {
		return honneur;
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonner = argentPossede / 10;
		parler(beneficiaire.getNom() + " prend ces " + argentDonner + " sous.");
		beneficiaire.recevoir(argentDonner);
		perdreArgent(argentDonner);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int force = 2 * honneur;
		if (force >= adversaire.getReputation()) {
			gagnerArgent(adversaire.argentPossede);
			parler("Je t'ai eu petit yakusa!");
			adversaire.perdre();
			honneur += 1;
			
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argentPossede);
			perdreArgent(adversaire.argentPossede);
			honneur -= 1;
			

		}
	}
	

}
