// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package MAE1Project;

/************************************************************/
/**
 * 
 */
public abstract class Action {
	
	// ------------------ PROPERTIES ------------------------ //

	/**
	 * String name property is associated to the action name. 
	 * This is a private property which is to be set once when the
	 * object is initialized and defines its type.
	 */
	private String name = null;
	
	/**
	 * Individual myPerformer instance which commands the action
	 * and has a one-to-one association with the action.
	 */
	private Individual myPerformer;
	
	//----------------------- METHODS ---------------------------//
	
	/**
	 * Class constructor 1
	 * @param name: String determining the name of the action. Not to be
	 * changed in the lifetime of the object
	 * @param performer: Individual instance which associates to the action
	 */
	public Action(String name, Individual performer){
		// Set the object properties
		this.setName(name);
		this.setMyPerformer(performer);
	}

	/**
	 * execute method performs the selected action over the input victim.
	 * @param victim: Individual instance over which the action is to be executed
	 */
	public abstract void execute(Individual victim);
	
	/***************** GETTERS AND SETTERS ******************/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// Check the property has been initialized, otherwise do nothing
		if (this.getName() == null) 
		{
			this.name = name;
		}
	}

	public Individual getMyPerformer() {
		return myPerformer;
	}

	public void setMyPerformer(Individual myPerformer) {
		this.myPerformer = myPerformer;
	}
};
