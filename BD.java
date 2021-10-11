package bibliotheque;

public class BD extends Livre{
	
   public boolean couleur = true; 
   public String description;  //lire de gauche a droite
   public String tailleBD;

   



   public BD(String titre, String auteur, double prix, int nb_pages, boolean couleur) {
	super(titre, auteur, prix, nb_pages);
	// TODO Auto-generated constructor stub
	this.couleur = couleur;     
   }


   

public BD(String titre, String auteur, double prix, int nb_pages, String genre, String description, String tailleBD) {
	super(titre, auteur, prix, nb_pages, genre);
	   
	this.description = description;
	this.tailleBD = tailleBD;  
}
   
   
    public BD(boolean couleur, String description, String tailleBD) {
	this.couleur = couleur;
	this.description = description;
	this.tailleBD = tailleBD;
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




public String getTailleBD() {
	return tailleBD;
}




public void setTailleBD(String tailleBD) {
	this.tailleBD = tailleBD;
}
   
  
public void Afficher() 
{
	System.out.println("Le livre " +"'"+ titre+ "'"+ " de l'auteur " +"'"+ auteur  +"'"+" : Prix " + prix + ", nombre de pages est " + nb_pages + ", couleur "  +"("+ couleur +")" );
	
	
}
   
   
   
   

}
