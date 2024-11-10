package employe;

//import Salaire;

public class Employe extends Salaire {
	private double Hsupp;
	private double PHsupp;
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(int matricule, String nom, int recrutement, double hsupp, double pHsupp) {
		super(matricule, nom, recrutement);
		this.Hsupp = hsupp;
		this.PHsupp = pHsupp;
	}
	public double getHsupp() {
		return Hsupp;
	}
	public void setHsupp(double hsupp) {
		Hsupp = hsupp;
	}
	public double getPHsupp() {
		return PHsupp;
	}
	public void setPHsupp(double pHsupp) {
		PHsupp = pHsupp;
	}
	public double Salaire(double Hsupp,double PHsupp) {
		return super.salaireDate()+(Hsupp*PHsupp);
	}
	@Override
	public String toString() {
		return "Employe [Hsupp=" + Hsupp + ", PHsupp=" + PHsupp + ", toString()=" + super.toString() + "]"+"salaire final :"+this.Salaire(this.Hsupp, this.PHsupp);
	}
	   public double calcul() {
	        return 2000;
	    }
	
	

}
