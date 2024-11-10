package employe;

public class Salaire {
	protected int matricule;

 protected String nom;
 protected int recrutement;
public Salaire(int matricule, String nom, int recrutement) {
	this.matricule = matricule;
	this.nom = nom;
	this.recrutement = recrutement;
}
public Salaire() {

}
public double calcul() {
    return 1000;
}
public int getMatricule() {
	return matricule;
}
public void setMatricule(int matricule) {
	this.matricule = matricule;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getRecrutement() {
	return recrutement;
}
public void setRecrutement(int recrutement) {
	this.recrutement = recrutement;
}
@Override
public String toString() {
	return "Salaire [matricule=" + matricule + ", nom=" + nom + ", recrutement=" + recrutement + "]";
}

 public int salaireDate() {
	 if(this.recrutement<2005) {
		 return 400;
	 }
	 return 280;
	 
	 
	 
 }
 public double Salairee() {
		return 1000;
	}
 
 
 
}
