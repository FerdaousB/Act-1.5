package bibliotheque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		            Livre l1 = new Livre("Le petit prince","St Exup�ry", 10.40, 50) ;
			        Livre l2 = new Livre("Contes","Grimm",14.40,254) ;
			        l1.Afficher() ;
			        l2.Afficher();
			        
			        BD b1 = new BD("Lucky Luke","Morris",10.40,45,true);
			        BD b2 = new BD("Tintin","Herge",200.40, 45,false);			        
			        b1.Afficher();
			        b2.Afficher(); 
			        
			        Manga m1 = new Manga("One piece","Eiichir Oda",5.40, 62);
			        Manga m2 = new Manga("Death Note","Tsugumi ba",7.40, 75) ;
			        m1.Afficher() ;
			        m2.Afficher() ;
			        
			        Roman r1 = new Roman("Dora","Dora",3.5 ,300) ;
			        r1.setNbChapitre(12);
			        r1.setDescription("Une description quelconque");
			        r1.Afficher();
			        
			        LivreRecette lrc1 = new LivreRecette("Marmiton", "Philippe Etchebest", 15.98, 110);
			        lrc1.Afficher();
			        
			        Recette rc1 = new Recette("Les p�tes crues", "Comment r�aliser de d�licieuses p�tes crues.", 3);
			        
			        rc1.addAstuce("Ne pas les faire cuire.");
			        rc1.addEtape("Sortir les p�tes de leur emballage");
			        lrc1.addRecette(rc1);
			        
			        
		
	}

}
