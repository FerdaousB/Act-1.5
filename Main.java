package bateau;

public class Main {
			
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bateau B = new Bateau();
		Coque C = new Coque();
		Cabine Ca = new Cabine();
		Pont P = new Pont();
		Mat M = new Mat();
		Voile V = new Voile();
		System.out.print(B + " est constitué de : "+ "\n"); 
		System.out.println(C);
		System.out.println(Ca);
		System.out.println(P + " est consituté du " + M + " qui est constitué de " + V);
		
		
		
	}
} 