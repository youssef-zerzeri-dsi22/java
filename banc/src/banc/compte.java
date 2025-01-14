package banc;


public class compte {
	private   int numC;
	private static  int compteur;

	private Personne titulaire;
	private float solde;
	private float decouvertMax=800;
	private float debitMax=1000;
	private boolean estdecouvert=true;
	

	public Personne getTitulaire() {
		return titulaire;
	}


	public void setTitulaire(Personne titulaire) {
		this.titulaire = titulaire;
	}


	public float getSolde() {
		return solde;
	}


	public void setSolde(float solde) {
		this.solde = solde;
	}


	public compte( Personne titulaire) {
		compteur++;
		this.numC=compteur;
		this.titulaire = titulaire;
	}
	
	
    @Override
	public String toString() {
		return "compte [numC=" + numC + ", titulaire=" + titulaire.toString() + ", solde=" + solde + ", decouvertMax="
				+ decouvertMax + ", debitMax=" + debitMax + ", estdecouvert=" + estdecouvert + "]";
	}
    public void crediter(float credit) {
    	if(credit<decouvertMax) {

    	this.solde+=credit;}
    }
    public void debiter(float debit) {
    	if(debit<debitMax) {
    		if(this.solde-debit>-600) {
    	    	this.solde-=debit;
    	    	this.estdecouvert=true;
    		}
    		else {
    			this.estdecouvert=false;
    		}
    	}
    }
    public void estaDécouvert() {
    	if(this.solde<0) {
    		this.estdecouvert=false;
    	}
    }
    public void MontantDécouvert() {
    	if(!this.estdecouvert) {
    		System.out.println("montant dans rouge c'est "+this.solde);
    	}
    }
    public void virement(float montant, compte d) {
        if (this.estdecouvert) {
    		this.debiter(montant);
    		if(this.estdecouvert) {

            d.crediter(montant); }
        }
    }
    public static boolean virement(float montant, compte p, compte d) {
    	if(p.estdecouvert) {
    		p.debiter(montant);
    		if(p.estdecouvert) {
                d.crediter(montant); 
                return true;

    		}
            return false;

    	}
        return false;

       
    }
    public static void afficherCompteSoldeMax(compte[] comptes) {
		if (comptes.length == 0) {
			System.out.println("Aucun compte .");
			return;
		}

		compte max = comptes[0];

		for (compte c : comptes) {
			if (c.getSolde() > max.getSolde()) {
				max = c;
			}
		}

		System.out.println("Le  compte de solde le plus élevé : ");
		System.out.println(max.toString());}
	
   

	public static void main(String[] args) {
    	Personne p =new Personne("youssef","ben kadha","nabeul");
        compte p1 = new compte(p); 
        System.out.println(p1.toString());
        Personne p2 =new Personne("yous","ben kadha","nabeul");
        compte p22 = new compte(p2); 
        p22.crediter(400);
        System.out.println(p22.toString());
        p22.virement(200, p1);
        System.out.println(p1.toString());
        System.out.println(p22.toString());
		compte[] comptes = { p1, p22};

		afficherCompteSoldeMax(comptes);


    	
    	
    	
    	
    }
	
	

	





}
