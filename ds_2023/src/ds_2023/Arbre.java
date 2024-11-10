package ds_2023;

public class Arbre extends Plante {
	private String type_Feuillage;
	private final int AbsorMoyenne=22;
	public Arbre(String nom, int hauteur, int age, int prix, String typeFeuillage) {
        super(nom, hauteur, age, prix);
        this.type_Feuillage = typeFeuillage;
    }
	public void description() {
		System.out.println("arbre :" );
		System.out.println(super.toString());

        //super.toString();

        System.out.println("type_Feuillage: " + type_Feuillage );

	}
	public int absorptionCO2() {
		if(super.hauteur>50) {
			return 3+this.AbsorMoyenne;
		}
		return this.AbsorMoyenne;

	}
	
	public String getType_Feuillage() {
		return type_Feuillage;
	}
	public void setType_Feuillage(String type_Feuillage) {
		this.type_Feuillage = type_Feuillage;
	}
	
}
