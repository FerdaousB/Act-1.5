package bateau;

public class Pont {
	
	private int id;
    private  String matiere;
    private String couleur;
   
	public Pont() {
		super();
	}

	public Pont(String matiere, String couleur) {
		super();
		
		this.matiere = matiere;
		this.couleur = couleur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Le Pont N°" + ++Bateau.next_id;
	}

	
    
	

}