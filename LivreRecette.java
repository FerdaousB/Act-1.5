package bibliotheque;

import java.util.List;

public class LivreRecette extends Livre{

	public int NbRecette;
	
	public List<Recette> rc; 

	public LivreRecette() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LivreRecette(String titre, String auteur, double prix, int nb_pages) {
		super(titre, auteur, prix, nb_pages);
		// TODO Auto-generated constructor stub
	}

	public LivreRecette(int nbRecette) {
		NbRecette = nbRecette;
	}

	public int getNbRecette() {
		return NbRecette;
	}

	public void setNbRecette(int nbRecette) {
		NbRecette = nbRecette;
	}
	
	public List addRecette(Recette R) {
		
		return rc;
		
	}
}
