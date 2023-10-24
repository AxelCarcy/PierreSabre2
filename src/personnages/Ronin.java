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
		parler(beneficiaire.getNom() + " prend ces " + argentPossede + " sous.");
		int argentDonner = argentPossede / 10;
		beneficiaire.recevoir(argentDonner);
	}
	

}
