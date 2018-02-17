 package glp;

public class Materiel {
	private String nomMateriel;
	private int NbMateriel;
	
	
	public Materiel(String nomMateriel, int NbMateriel) {
		this.nomMateriel= nomMateriel;
		this.NbMateriel=NbMateriel;
		
	}
	
	public void ajouterMateriel(int index) {
		this.NbMateriel += index;
	}
	public void supprimerMateriel(int j) {
		this.NbMateriel -= j;
	}

	public String getNomMateriel() {
		return nomMateriel;
	}

	public void setNomMateriel(String nomMateriel) {
		this.nomMateriel = nomMateriel;
	}

	public int getNbMateriel() {
		return NbMateriel;
	}

	public void setNbMateriel(int nbMateriel) {
		NbMateriel = nbMateriel;
	}


}
