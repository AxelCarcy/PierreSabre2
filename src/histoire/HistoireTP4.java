package histoire;
import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args)
	{
		Humain prof = new Humain("Prof", "kompucha", 54);
		Commercant marco = new Commercant("Marco", "thé", 15);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Bonjour", 0);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);
		
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
		
		yaku.direBonjour();
		yaku.extorquer(marco);
	}
}
