package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 * @param tauxRemuneration  représente le taux de rémunération du livret A donné en %
	 */
	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super(solde,0);
		this.tauxRemuneration = tauxRemuneration;
	}
	/** ajoute les intérets au solde du compte en fonction de son taux de rémunération
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
