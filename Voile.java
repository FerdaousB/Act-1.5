package bateau;

public class Voile {
	private int id;
	private int hauteurMax;
	private int hauteurMin;
    private  String size;
    public String marque;
    protected  String direction;
    private int hauteur;
    
    private boolean enroule = true;
    private boolean deroule = false ;

    
	public Voile() {
		super();
	}


	public Voile(int id, int hauteurMax, int hauteurMin, String size, String marque, String direction, int hauteur) {
		super();
		this.id = id;
		this.hauteurMax = hauteurMax;
		this.hauteurMin = hauteurMin;
		this.size = size;
		this.marque = marque;
		this.direction = direction;
		this.hauteur = hauteur;
	}






	public boolean enroule() {

		if (hauteur == hauteurMax) 
			 return enroule;
		else 
			return deroule;
    }
	

	public boolean deroule() {

		if (hauteur == hauteurMin) 
			 return deroule;
		else 
			return enroule;
    }




	public int getHauteurMax() {
		return hauteurMax;
	}






	public void setHauteurMax(int hauteurMax) {
		this.hauteurMax = hauteurMax;
	}






	public int getHauteurMin() {
		return hauteurMin;
	}






	public void setHauteurMin(int hauteurMin) {
		this.hauteurMin = hauteurMin;
	}






	public String getSize() {
		return size;
	}




	public void setSize(String size) {
		this.size = size;
	}




	public String getMarque() {
		return marque;
	}




	public void setMarque(String marque) {
		this.marque = marque;
	}




	public String getDirection() {
		return direction;
	}




	public void setDirection(String direction) {
		this.direction = direction;
	}




	public int getHauteur() {
		return hauteur;
	}




	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	



	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	@Override
	public String toString() {
		return "Voile N°" + ++Bateau.next_id ;
	}





	
	
    
   
    
    
	

}
