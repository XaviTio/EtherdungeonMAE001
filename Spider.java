// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package MAE1Project;

/************************************************************/
/**
 * 
 */
//----------------------- METHODS ---------------------------//

	/**
	 * Class constructor for the Spider monster type
	 */
public class Spider extends Monster {
	public Spider() {
		this.name='Spider';
		this.health=0.44;
		this.performance=1.222;
		this.isDead=false;
		this.type='Monster';
	}
}
/**
 * performAction implementation over a single victim
 * @param victim: Individual instance over which we want to
 * perform the action. I this case the action consists of a
 * poison. A poisoned target will lose 3 HPs at the beginning 
 * of its turn up to three times.
 */
public abstract void performAction(Individual victim) {
	victim.health -= this.performance;
}