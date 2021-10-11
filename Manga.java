package bibliotheque;

public class Manga extends Livre {
	
	   public boolean couleur = true;
	   public String description;
	   public String tailleM;
	   
	   
	   
	
	   public Manga() {
		super();
		// TODO Auto-generated constructor stub
	   
	  }




	public Manga(String titre, String auteur, double prix, int nb_pages) {
		super(titre, auteur, prix, nb_pages);
		// TODO Auto-generated constructor stub
	}
	   
	public Manga(boolean couleur, String description, String tailleM) {
		this.couleur = couleur;
		this.description = description;
		this.tailleM = tailleM;
	}




	public boolean isCouleur() {
		return couleur;
	}




	public void setCouleur(boolean couleur) {
		this.couleur = couleur;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getTailleM() {
		return tailleM;
	}




	public void setTailleM(String tailleM) {
		this.tailleM = tailleM;
	}
	   
	   


}
