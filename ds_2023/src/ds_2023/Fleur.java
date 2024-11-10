package ds_2023;

public class Fleur extends Plante {
	private String couleur;
	private int moisF;
	   public Fleur(String nom, int hauteur, int age, int prix, String couleur, int moisF) {
	        super(nom, hauteur, age, prix);
	        this.couleur = couleur;
	        this.moisF = moisF;
	    } 	public void description(){
		System.out.println("fleur" );
		//System.out.println("couleur :"+this.couleur+", moisF :"+moisF );
		System.out.println(super.toString());
        System.out.println("Couleur: " + couleur + ", Mois de floraison: " + moisF );
        //this.fleurir();

	}
	    public void fleurir() {
	    	if(this.moisF==4 ||this.moisF==5 || this.moisF==6 ) {
	            System.out.println(" c'est une fleur ");

	    	}
	    	else {
	            System.out.println(" n'est pas  une fleur ");

	    	}
	    }
		public String getCouleur() {
			return couleur;
		}
		public void setCouleur(String couleur) {
			this.couleur = couleur;
		}
	    

}
