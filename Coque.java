package bateau;

public class Coque {
	

	    private int id;
	    private float longueur;
	    private  float largeur;
	    private String couleur;
		
	    
	   


		public Coque() {
			super();
		}


		public Coque(int id, float longueur, float largeur, String couleur) {
			super();
			this.id =id;
			this.longueur = longueur;
			this.largeur = largeur;
			this.couleur = couleur;
		}


		public int getId() {
			return id;
	   }


	    public void setId(int id) {
			this.id = id;
		}


		public float getLongueur() {
			return longueur;
		}


		public void setLongueur(float longueur) {
			this.longueur = longueur;
		}


		public float getLargeur() {
			return largeur;
		}


		public void setLargeur(float largeur) {
			this.largeur = largeur;
		}


		public String getCouleur() {
			return couleur;
		}


		public void setCouleur(String couleur) {
			this.couleur = couleur;
		}
		
		
	

		 @Override
			public String toString() {
			      id =++Bateau.next_id;
				return "La Coque N?" + ++Bateau.next_id; // un nouvel objet est cr??, la valeur de id augmente
			}

}
