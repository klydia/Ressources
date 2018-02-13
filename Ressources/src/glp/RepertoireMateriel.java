package glp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RepertoireMateriel {
	
	private ArrayList<String> listeDesMateriaux;
	private Materiel materiel  ;
	private Contact materiel1=null;
	
			public RepertoireMateriel() {
				materiel =new Materiel("","","","");
				listeDesMateriaux=new ArrayList<String> ();
		
		}
			
		public void ajouterMateriel(int pc,int projecteur,int tableau,int micro) {
				
				materiel.setPc(pc);
				materiel.setProjecteur(projecteur);
				materiel.setTableau(tableau);
				materiel.setMicro(micro);
				sauvegarderMateriel(materiel);
				
			}

		public void sauvegarderMateriel (Materiel materiel) {
			try {
				BufferedWriter materiaux=new BufferedWriter
				(new FileWriter(".\\data\\contacts.txt",true));
				materiaux.write("\n"+
				materiel.getPc()+"\n"+
				materiel.getProjecteur()+"\n"+
				materiel.getTableau()+"\n"+
				materiel.getMicro()+"\n");
				materiaux.close();
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}	
		}
		
		public int nombreMateriel() {
			return listeDesMateriaux.size();
		}
		
		public void lireListeDesMateriaux() {
			BufferedReader materiaux = null;
			try {
				materiaux = new BufferedReader (new FileReader("jenaimepas.txt"));
			} catch (FileNotFoundException e1) { 
			
				e1.printStackTrace();
			}
			
			try {
				while(materiaux.readLine()!=null)
				{
					listeDesMateriaux.add(materiaux.readLine());
				}
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		
			try {
				materiaux.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
	}
		
	

		public void remove(String name) {
			
			listeDesMateriaux.clear();
			lireListeDesMateriaux();
			File f=new File(".\\data\\contacts.txt");
			f.delete();
			 
			for(int i=0;i<listeDesMateriaux.size();i++) {
				if(name==listeDesMateriaux.get(i)) {
					listeDesMateriaux.set(i,"");
				  	listeDesMateriaux.set(i+1,"");
					listeDesMateriaux.set(i+2,"");
					listeDesMateriaux.set(i+3,"");
				}
				else {
				BufferedWriter materiaux;
				try {
					
					materiaux = new BufferedWriter(new FileWriter(new File(".\\data\\contacts.txt"),true));
				
						materiaux.write(listeDesMateriaux.get(i)+"\n");
						materiaux.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
				}
			
			

	}
		
}
	

	
}
