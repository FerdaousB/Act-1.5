package bibliotheque;

import java.util.ArrayList;

public class Recette extends LivreRecette {

	public String nom;
	public String Description;
	public int NiveauDiff;
	public String NvEtape;
	public String NvAstuce;


	
	public Recette() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Recette(int nbRecette) {
		super(nbRecette);
		// TODO Auto-generated constructor stub
	}



	public Recette(String titre, String auteur, int prix, int nb_pages) {
		super(titre, auteur, prix, nb_pages);
		// TODO Auto-generated constructor stub
	}



	public Recette(String nom, String description, int niveauDiff) {
		this.nom = nom;
		Description = description;
		NiveauDiff = niveauDiff;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}



	public int getNiveauDiff() {
		return NiveauDiff;
	}



	public void setNiveauDiff(int niveauDiff) {
		NiveauDiff = niveauDiff;
	}



	public String addEtape(String etapes) {
		
		return	etapes= (etapes +" puis "+NvEtape);
			
		}
		
	    public String addAstuce(String astuce) {
			
		return	astuce= (astuce +" et "+NvAstuce);
				
	    }


	
	
	
	
	
}
