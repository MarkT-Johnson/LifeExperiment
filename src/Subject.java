
public class Subject extends Creature{
	
	/**
	 * Determines how hungry the subject is
	 */
	private int hunger;
	
	/**
	 * Constructs the the with a specific name
	 * @param name The name of the subject
	 */
	public Subject(String name) {
		this.setAlive(true);
		this.setAge(0);
		this.setName(name);
		this.setCreatureNumber(Creature.getNumber());
		Creature.setNumber(Creature.getNumber() + 1);
	}
	
	//=========================================================================
	
	/**
	 * Causes subject to hunger quicker and return a random number to act
	 * as a random encounter determiner
	 * @return Random number to allow the subject to experience encounters
	 */
	public double movement() {
		hunger(-2);
		
		return Math.random();
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Allows the creature to gather food to increase hunger with a random chance
	 * for how much it increases by, cannot exceed 100 hunger.
	 */
	public void gatherFood() {
		hunger();
		
		hunger((int)Math.random() * 5);
		
		if(hunger > 100) {
			hunger = 100;
		}
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Changes the amount of hunger the subject has left and sets alive
	 * to false if the creature hits zero hunger
	 * @param value The amount to change the hunger by
	 */
	public void hunger(int value) {
		hunger = hunger + value;
		if(hunger <= 0) {
			this.setAlive(false);
		}
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Reduces the subject's hunger by one
	 */
	public void hunger() {
		hunger--;
		if(hunger <= 0) {
			this.setAlive(false);
		}
	}
	
	//=========================================================================
	
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	//----------------------------------------//
	public int getHunger() {
		return hunger;
	}
}
