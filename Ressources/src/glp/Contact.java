package glp;

public class Contact {

	private String nom;
	private String prenom;
	private String num;
	private String responsabilite;
	private String email;
	
	
	public Contact(String nom, String prenom, String num, String responsabilite, String email ) {
			this.nom = nom;
			this.prenom = prenom;
			this.num = num;
			this.responsabilite = responsabilite;
			this.email = email;
			}
			
			public String toString() {
				return "Contact [nom=" + nom + ", prenom="+ prenom+", num=" + num + ", responsabilite=" + responsabilite + ", email=" + email + "]";
			}

			public String getNom() {
				return nom;
			}

			public void setNom(String nom) {
				this.nom = nom;
			}
			
			public String getPrenom() {
				return prenom;
			}
			
			public void setPrenom(String prenom) {
				this.prenom=prenom;
			}

			public String getNum() {
				return num;
			}

			public void setNum(String num) {
				this.num = num;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}
			
			public String getResponsabilite() {
				return responsabilite;
			}
			
			public void setResponsabilite
			(String responsabilite) {
				this.responsabilite = responsabilite;
			}

	



}
