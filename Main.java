package bateau;

public class Main {
			
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bateau B = new Bateau(1);
		Coque C = new Coque(2);
		Cabine Ca = new Cabine(3);
		Pont P = new Pont(4);
		Mat M = new Mat(5);
		Voile V = new Voile(6);
		System.out.print(B + " est constitué de : "+ "\n"); 
		System.out.println(C);
		System.out.println(Ca);
		System.out.println(P + " est consituté du " + M + " qui est constitué de " + V);
		
	}
} 