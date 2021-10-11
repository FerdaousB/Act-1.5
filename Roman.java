package bibliotheque;

public class Roman extends Livre {

	
	   public int NbChapitre;
	   public String Description;
	
	   public Roman() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
	   
	public Roman(String titre, String auteur, double prix, int nb_pages) {
		super(titre, auteur, prix, nb_pages);
		// TODO Auto-generated constructor stub
	}
	public Roman( int nbChapitre, String description) {
		NbChapitre = nbChapitre;
		Description = description;
	}
	
	
	public int getNbChapitre() {
		return NbChapitre;
	}
	public void setNbChapitre(int nbChapitre) {
		NbChapitre = nbChapitre;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	   
	   
	   
	   
	   
	
}
