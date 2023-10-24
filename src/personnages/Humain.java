package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int argentPossede;
	
	
	public Humain(String nom, String boissonFav, int argentPossede) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argentPossede = argentPossede;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgentPossede() {
		return argentPossede;
	}
	
	
	public void parler(String texte) {
		System.out.println("("+ nom +") - " + texte);
	}
	
	public void direBonjour() {
		parler ("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFav);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argentPossede >= prix)
		{
		parler("J'ai " + argentPossede + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous" );
		argentPossede = argentPossede - prix;
		}
		
		else
		{
			parler("Je n'ai plus que  " + argentPossede + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous" );
		}
	}
	
	public void gagnerArgent (int argentGagner) {
		argentPossede += argentGagner;
	}
	
	public void perdreArgent (int argentPerdu) {
		argentPossede -= argentPerdu;
	}
	
	
	
}
