package ds_2023;

public class Plante {
	protected String nom;
	protected int hauteur;
	protected int age;
	protected int prix;
	
	

	public Plante() {
	}

	public Plante(String nom,int hauteur,int age,int prix) {
		this.nom = nom;
        this.hauteur = hauteur;
        this.age = age;
        this.prix = prix;
	}
	
    @Override
	public String toString() {
    	return "nom :"+nom+", hauteur :"+hauteur+ " cm, Age: " + age + " mois, Prix: " + prix + " EUR";
    }
    public void description() {
    	System.out.println(this.toString());
    	
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
   

}
