package ex1;

import java.util.Date;
/**
 * 
 * @author ETY1
 * Repr�sente une entit� entreprise
 */
public class entreprise {
	/** num�ro de Siret de l'entreprise**/
	public int Siret;
	/** nom de l'entreprise**/
	public String Nom;
	/** adresse de l'entreprise**/
	public String adresse;
	/** date de cr�ation de l'entreprise**/
	public Date date_Creation;
	
	/** capital maximal de l'entreprise**/
	public static final int capitalMax = 3000000;
	
	/** ne fait rien**/
	public void Afficher_statut(){
		
	}
	
	/** getter de Siret**/
	public int getSiret() {
		return Siret;
	}
	/** setter de Siret**/
	public void setSiret(int siret) {
		Siret = siret;
	}
	/** getter du nom**/
	public String getNom() {
		return Nom;
	}
	/** setter du nom**/
	public void setNom(String nom) {
		Nom = nom;
	}
	/** getter de l'adresse**/
	public String getAdresse() {
		return adresse;
	}
	/** setter de l'adresse**/
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/** getter de la date de cr�ation**/
	public Date getDate_Creation() {
		return date_Creation;
	}
	/** setter de la date de cr�ation**/
	public void setDate_Creation(Date date_Creation) {
		this.date_Creation = date_Creation;
	}
}
