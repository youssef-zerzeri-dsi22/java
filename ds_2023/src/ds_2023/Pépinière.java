package ds_2023;


public class Pépinière {
	private Plante[] inventaire;
	private final int MAX_PLANTES=1000;
	private static int nombreDePlantes;
	public Pépinière() {
		inventaire=new Plante[MAX_PLANTES];
		nombreDePlantes=0;
	}
	public void ajoutPlante(Plante plante) {
		//getclass().geSimpleName(); tjib esm el class
		if(nombreDePlantes<MAX_PLANTES) {
			
			inventaire[nombreDePlantes]=plante;
	        nombreDePlantes++;  // Incrémenter le nombre de plantes

		}else {
	        System.out.println("tableau complet"  );
		}
	}
	public void afficherInventaire() {
		for(Plante s:inventaire) {
			if(s!=null) {
				s.description();
				

			}
			if(s instanceof Fleur) {
				((Fleur) s).fleurir();
			}
		}
	}
	public int totalAbsorptionTotaleCO2() {
		int  k=0;
		for(Plante s:inventaire) {
			if(s instanceof Arbre) {
			 k += ((Arbre) s).absorptionCO2();
			}

		
	}
		return k;
	}
	public int compterArbresCaduques() {
		int  k=0;
		for(Plante s:inventaire) {
			if(s instanceof Arbre) {
			 if(((Arbre) s).getType_Feuillage().equals("Caduque")) {
				 k++;
			 }
			}

		
	}
		return k;
	}
		
	
}
