package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int argentPossede;
	protected int nbConnaissance;
	protected String [] memoire = new String[3];
	
	
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
	
	protected void gagnerArgent (int gain) {
		argentPossede += gain;
	}
	
	protected void perdreArgent (int perte) {
		argentPossede -= perte;
	}
	

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance < memoire.length) {
			memoire[nbConnaissance] = humain.getNom();
			nbConnaissance += 1;
		}
		
		
		else {
			for (int i = 0; i < memoire.length - 1; i++) {
				memoire[i] = memoire[i+1];
				}	
			memoire[nbConnaissance - 1] = humain.getNom();
			}
		}
	
	private void repondre(Humain humain){
		direBonjour();
		memoriser(humain);
	}
	
	public void listerConnaissance() {
		String connaissances = "";
		
		for (int i = 0; i < nbConnaissance; i++) {
			connaissances += memoire[i] + ", ";
		}
		System.out.println("Je connais beaucoup de monde dont: " + connaissances + ".");
	}
	
}
