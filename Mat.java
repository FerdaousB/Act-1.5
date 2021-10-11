package bateau;

public class Mat {
	
	private int id;
    private String matiere;
   
	private  float longeur;
    
    
    
	public Mat(int id) {
		super();
		this.id = id;
	}
	public Mat(String matiere, float longeur) {
		super();
		
		this.matiere = matiere;
		this.longeur = longeur;
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
	public float getLongeur() {
		return longeur;
	}
	public void setLongeur(float longeur) {
		this.longeur = longeur;
	}
   
	 @Override
		public String toString() {
			return "Mat N°"+id;
		}
	
	

}
