// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package MAE1Project;

/************************************************************/
/**
 * Monster abstract class inherits from the Individual abstract
 * class. 
 */
public abstract class Monster extends Individual {

	
	//----------------------- METHODS ---------------------------//
	
	/**
	 * Class constructor 1
	 * @param type: String defining the type of Monster
	 * @param name: String defining the name of the Monster
	 * @param action: Action instance related to the Monster
	 * @param performance: float indicating the relative performance of the Monster
	 */
	public Monster(String type, String name, Action action, float performance){
		super(type, name, action, performance);   		// Call superclass constructor
	}
	
	/**
	 * returnClassTeam is an inherited method that returns a String
	 * which defines the Team to which the Individual belongs to.
	 * @return String to which the Individual belongs to
	 */
	public String returnClassTeam() {
		// Return the String
		return "MONSTER";
	}
};
