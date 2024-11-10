package app;

public class Vehicule {
	private int numero ;
	private String  marque;
	private String  modele;
	private int  annee;
	private int  prix;
	private   int count;

public  Vehicule(String m, String modele,int annee,int prix) {
	this.marque=m;
	this.modele=modele;
	this.annee=annee;
	this.prix=prix;
    this.numero = ++count;
	
	
	
	
}
public void decrisVehicule() {
    System.out.println( "marque_" +marque + "_modele_ " + modele + ",annee_ " + annee +"_"+ "prix_  "+ prix+"$k");

}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getModele() {
	return modele;
}
public void setModele(String modele) {
	this.modele = modele;
}
public int getAnnee() {
	return annee;
}
public void setAnnee(int annee) {
	this.annee = annee;
}
public double getPrix() {
	return prix;
}
public void setPrix(int prix) {
	this.prix = prix;
}

@Override
public String toString() {
    return "marque_" +marque + "modele_ " + modele + ",annee_ " + annee + "prix_  "+ prix+"$";
}   
public static void main(String[] args) {
    Vehicule v1 = new Vehicule("wolzvagen","golf_6",2008,40); 
    v1.decrisVehicule();
  
}
}
