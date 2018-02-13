package glp;
import glp.Reunion;
import glp.Conference;

public class Evenement {
	
	private Reunion seminaire;
	private Conference conf;
	private Formation formation;
	private int capacite;
	private int duree;
	
	public Evenement (Reunion seminaire,Conference conf, Formation formation, int capacite, int duree) {
		this.conf=conf;
		this.seminaire = seminaire;
		this.formation = formation;
		this.capacite=capacite;
		this.duree=duree;
	}
		

	public Reunion getSeminaire() {
		return seminaire;
	}

	public void setSeminaire(Reunion seminaire) {
		this.seminaire = seminaire;
	}

	public Conference getConf() {
		return conf;
	}

	public void setConf(Conference conf) {
		this.conf = conf;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}


	public int getCapacite() {
		return capacite;
	}


	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}


	public int getDuree() {
		return duree;
	}


	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	
}
