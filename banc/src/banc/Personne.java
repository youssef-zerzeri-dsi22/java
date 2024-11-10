	package banc;
	
	public class Personne {
		private String nom;
		private String prenom;
		private String Adress;
		public String getNom() {
			return nom;
		}
	
		public String getPrenom() {
			return prenom;
		}
		
		public String getAdress() {
			return Adress;
		}
		
		@Override
		public String toString() {
			return "Personne [nom=" + nom + ", prenom=" + prenom + ", Adress=" + Adress + "]";
		}
	
		public Personne(String k, String prenom, String adress) {
			this.nom = k;
			this.prenom = prenom;
			this.Adress = adress;
		}
		
		
		
	}
	
