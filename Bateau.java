package bateau;

public class Bateau {

	
	private int id;
	private String marque;
	private int size;
	private String nom;
	private String direction;
	
	
	
	public Bateau(int id) {
		super();
		this.id = id;
	}


	public Bateau(int id, String marque, int size, String nom, String direction) {
		super();
		this.id = id;
		this.marque = marque;
		this.size = size;
		this.nom = nom;
		this.direction = direction;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getdirection() {
		return direction;
	}

	public void setdirection(String direction) {
		this.direction = direction;
	}


	@Override
	public String toString() {
		return "Le Bateau N° "+id;
	}

	

	
	
	
	
}
