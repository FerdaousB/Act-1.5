package bateau;

public class Cabine {
	
	private int id;
    private String type;
    private  float largeur;
    private float hauteur;
   
	public Cabine() {
		super();
	}

	public Cabine(String type, float largeur, float hauteur) {
		super();
		
		this.type = type;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getLargeur() {
		return largeur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}

	public float getHauteur() {
		return hauteur;
	}

	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}

	@Override
	public String toString() {
		
		// synchronized {
	     //       id = id + 1;
	 
	//	 }
		 return "La Cabine N°" + ++Bateau.next_id;
	}
    
	
    
    

}
