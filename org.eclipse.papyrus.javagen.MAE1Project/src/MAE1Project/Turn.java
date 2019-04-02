// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package MAE1Project;

//------------------ IMPORT MODULES ---------------------------//

//No modules to import

/************************************************************/
public class Turn<T extends Individual, Q extends Individual> {
	
	// ------------------ PROPERTIES ------------------------ //
	
	/**
	 * teamA property stores the team from which the owner shall be picked
	 */
	private Team<T> teamA;
	
	/**
	 * teamB property stores the opposing team
	 */
	private Team<Q> teamB;
	
	/**
	 * owner is the member of teamA who owns the encounter
	 */
	private T owner;
	
	/**
	 * ui property stores the UI singleton
	 */
	private UI ui;
	
	//----------------------- METHODS ---------------------------//
	
	/**
	 * Class constructor
	 * @param teamA: Team of type T which extends individual
	 * @param teamB: Team of type Q which extends individual
	 * @param userInput: boolean which defines if required user input or automatic draft
	 */
	public Turn(Team<T> teamA, Team<Q> teamB, boolean userInput){
		// Set properties
		this.setTeamA(teamA);
		this.setTeamB(teamB);
		this.setUi(UI.INSTANCE);
		if (userInput) {
			this.setOwner(this.draftByInput());		// Draft by input
		}
		else{
			this.setOwner(this.draftRandomly());	// Draft randomly
		}
	}
	
	/**
	 * runTurn method executes the specified turn over the owner
	 * @param owner: represents the entity (Individual) who owns the turn and who is
	 * going to perform its action over a team-mate or an opponent
	 * @param temaA : Team instance associated to the owner. Has to be of same type
	 * of the owner
	 * @param teamB: Team instance associated to the opponents. 
	 */
	public Turn(T owner, Team<T> teamA, Team<Q> teamB) {
		// Set properties
		this.setOwner(owner);
		this.setTeamA(teamA);
		this.setTeamB(teamB);
		this.setUi(UI.INSTANCE);
	}
	
	/**
	 * runTurn method executes the specified turn over the owner
	 */
	public void runTurn() {
		// Call on performAction of owner
		owner.performAction(teamA, teamB);
	}
	
	/**
	 * draftByInput drafts the owner of the Turn by means of user input
	 * @return owner of T type
	 */
	private T draftByInput() {
		// Generate draft string
		String out = String.format("\n Pick a character: \n %s \n Choose a character 1 - %d \n", 
				teamA.toString(), teamA.getMembers().size());
		
		// Print to screen
		ui.printToScreen(out);
		
		// Get integer from screen
		// TODO: perform exception checking here
		int input = Integer.getInteger(ui.inputScreen());
		
		// Set the owner
		// TODO: implement IndexOutOfBoundsExceptcion
		T newOwner = teamA.getMembers().get(input-1);
		
		// Print the selection
		String out1 = String.format("\n Selected %s \n", newOwner.toString());
		ui.printToScreen(out1);
		
		// Return the owner
		return newOwner;
	}
	
	/**
	 * draftRandom drafts the owner of the Turn by means of a random int generator
	 * @return owner of T type
	 */
	private T draftRandomly() {
		// Generate a random number from 0 to len(teamA) to obtain an owner
		int randInt = (int) (teamA.getMembers().size() * Math.random());
		
		// Set the owner
		// TODO: implement IndexOutOFBounds Exception
		T newOwner = teamA.getMembers().get(randInt);
		
		// Print the selection
		String out = String.format("\n Selected %s \n", newOwner.toString());
		ui.printToScreen(out);
		
		// Return the owner
		return newOwner;
	}
	
	/***************** GETTERS AND SETTERS ******************/
	
	public Team<T> getTeamA() {
		return teamA;
	}

	public void setTeamA(Team<T> teamA) {
		this.teamA = teamA;
	}

	public Team<Q> getTeamB() {
		return teamB;
	}

	public void setTeamB(Team<Q> teamB) {
		this.teamB = teamB;
	}

	public T getOwner() {
		return owner;
	}

	public void setOwner(T owner) {
		this.owner = owner;
	}

	public UI getUi() {
		return ui;
	}

	public void setUi(UI ui) {
		this.ui = ui;
	}
	
};
