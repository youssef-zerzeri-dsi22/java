package app;

public class AgenceMobiliere {
	private Vehicule[] tab;
	private int max;
	private int nb=0;
	public AgenceMobiliere(int max) {
		this.max=max;
		tab=new Vehicule[max];
	}
	public void ajoutVehicule(Vehicule v) {
		if(nb<max) {
		    
			tab[nb]= v;
			
			tab[nb].decrisVehicule();
			nb++;
		}
		else {
			System.out.println("tab c'est complexééé beacoupp");
		}
		
	}
	public void selection(int n) {
		if(n>0 && n<nb) {
			System.out.println("case_"+n+ "_existe ");

			tab[n-1].decrisVehicule();
		}else {
			System.out.println("case"+n+ "n existe pas");

		}
	}
	public void selection(String mq) {
		boolean b=false;
		for(int i=0;i<nb;i++) {
			if(tab[i].getMarque() == mq) {
				System.out.println("on a we find cars cet model_"+mq);

				tab[i].decrisVehicule();
				b =true;
			}
		}
		if(!b) {
			System.out.println(mq+"n_existe pas");

		}
	}
	 public void selection(double px) {
	        boolean k = false;
	        for (int i = 0; i < nb; i++) {
	            if (tab[i].getPrix() < px) {
	    			System.out.println("les voiture existes under_"+px);

	                tab[i].decrisVehicule();
	                k = true;
	            }
	        }
	        if (!k) {
	            System.out.println("il n ya pas prix under that_ "+px);
	        }
	    }
	 public void ancien() {
		 if(nb==0) {
			 System.out.println("rien c est ici ");
	            return;
		 }
		 Vehicule r=this.tab[0];
		 for(int i=1;i<nb;i++){
			 if (tab[i].getAnnee() < r.getAnnee()) {
	                r = tab[i];
	            }
		 }
         System.out.println("car plus ancien "+r.getMarque());

		 
	 }

	
}
