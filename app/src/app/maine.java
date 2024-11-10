package app;

public class maine {
	public static void main(String[] args) {
		 AgenceMobiliere t=new AgenceMobiliere(4);
		 
		 Vehicule v = new Vehicule("Clio", "Classique", 2000, 20000);
	       Vehicule w = new Vehicule("Mercedes", "Fantôme", 2008, 60000);
	       Vehicule x = new Vehicule("KIA", "Picanto", 2012, 35000);
	       t.ajoutVehicule(v);
	       t.ajoutVehicule(w);
	       t.ajoutVehicule(x);
		  t.selection("Mercedes");
		  t.selection(1);
		  t.selection(40000.0);
		  t.ancien();
		  
	}
}

