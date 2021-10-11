package bibliotheque;

public class Livre {
	
	public String titre;
    public String auteur;
    public double prix;
    public int nb_pages;
    public String genre;
	
    
    public Livre() {
		super();
	}


	public Livre(String titre, String auteur, double prix, int nb_pages, String genre) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.nb_pages = nb_pages;
		this.genre = genre;
	}


	public Livre(String titre, String auteur, double prix, int nb_pages) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.nb_pages = nb_pages;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public int getNb_pages() {
		return nb_pages;
	}


	public void setNb_pages(int nb_pages) {
		this.nb_pages = nb_pages;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	


	public void Afficher() 
	{
		System.out.println("Le livre " +"'"+ titre+ "'"+ " de l'auteur " +"'"+ auteur  +"'"+" : prix " + prix + " Le nombre de pages est " + nb_pages);
		
		
	}
    
	
    
    
    
    
    
    
    

}
