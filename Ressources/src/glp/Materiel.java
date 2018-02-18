 package glp;

 
public class Materiel {
	
		private String NbPc; 
		private String NbMicro;
		private String NbProjecteur ;
		private String NbTableau;

		public Materiel(String NbPc, String NbMicro, String NbProjecteur, String NbTableau) {
			this.NbPc=NbPc;
			this.NbMicro=NbMicro;
			this.NbProjecteur=NbProjecteur;
			this.NbTableau=NbTableau;
			
		}

		public String getNbPc() {
			return NbPc;
		}

		public void setNbPc(String nbPc) {
			NbPc = nbPc;
		}

		public String getNbMicro() {
			return NbMicro;
		}

		public void setNbMicro(String nbMicro) {
			NbMicro = nbMicro;
		}

		public String getNbProjecteur() {
			return NbProjecteur;
		}

		public void setNbProjecteur(String nbProjecteur) {
			NbProjecteur = nbProjecteur;
		}

		public String getNbTableau() {
			return NbTableau;
		}

		public void setNbTableau(String nbTableau) {
			NbTableau = nbTableau;
		}
		
		
		
}


