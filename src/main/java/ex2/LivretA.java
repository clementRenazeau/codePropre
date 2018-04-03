package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de r�mun�ration dans le cas d'un livret A */
	private double tauxRemuneration;

	/** Ce constructeur est utilis� pour cr�er un compte de type Livret A
	 * @param type = LA
	 * @param solde repr�sente le solde du compte
	 * @param decouvert  repr�sente le d�couvert autoris�
	 * @param tauxRemuneration  repr�sente le taux de r�mun�ration du livret A donn� en %
	 */
	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super(solde,0);
		this.tauxRemuneration = tauxRemuneration;
	}
	/** ajoute les int�rets au solde du compte en fonction de son taux de r�mun�ration
	*/
	public void appliquerRemuAnnuelle(){
		double newSolde = this.getSolde();
		newSolde+=this.getSolde()*tauxRemuneration;
		this.setSolde(newSolde);
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
