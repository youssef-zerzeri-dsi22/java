package ds_2023;

	public class Main {



public static void main(String[] args) { 
	System.out.println("Pépinière GREEN HANDS"); 
	Pépinière pépinière = new Pépinière();
	Fleur rose = new Fleur (null, 30, 12, 15, "Rouge", 2);
	Fleur tulipe = new Fleur ("Tulipe", 20, 8, 12, "Jaune", 4); 
	Arbre chêne = new Arbre ("Chêne", 200, 60, 89, "Caduque");
	Arbre sapin = new Arbre ("Sapin", 150, 30, 59, "Persistant");
	rose.setNom("Rose");
	System.out.println("la "+rose.getNom()+" a le couleur "+rose.getCouleur());
	pépinière.ajoutPlante(rose);
	pépinière.ajoutPlante(tulipe);
	pépinière.ajoutPlante(chêne);
	pépinière.ajoutPlante(sapin);
	pépinière.afficherInventaire();
	System.out.println("Total Aborption CO2"+ pépinière.totalAbsorptionTotaleCO2());
	System.out.println("Nombre d'arbres Caduques dans la pépinière : " + pépinière.compterArbresCaduques());
	
}
	}

