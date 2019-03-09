
public class Subject extends Creature{

	/**
	 * Determines how hungry the subject is
	 */
	private int hunger;
	/**
	 * The name of the creature
	 */
	private String name;

	/**
	 * Constructs the the with a specific name
	 * @param name The name of the subject
	 */
	public Subject(String name) {
		this.setAlive(true);
		this.setHunger(100);
		this.setAge(1);
		this.setName(name);
		this.setCreatureNumber(Creature.getNumber());
		this.setStrength((int)(Math.random() * 6));
		Creature.setNumber(Creature.getNumber() + 1);
	}

	//=========================================================================

	/**
	 * Causes subject to hunger quicker and return a random number to act
	 * as a random encounter determiner
	 * @return Random number to allow the subject to experience encounters
	 */
	public double movement() {
		System.out.println(name + " has gone for a walk...");
		hunger(-2);

		return Math.random();
	}

	//-------------------------------------------------------------------------

	/**
	 * Allows the creature to gather food to increase hunger with a random chance
	 * for how much it increases by if it increases, cannot exceed 100 hunger.
	 * Ranges from -5 to 5
	 */
	public void gatherFood() {
		int food = -5 + (int)Math.random() * ((5 + 5) + 1);

		if(hunger > 100) {
			hunger = 100;
		}
		
		//Describes food gathered by subject
		if(food > 0) {
			System.out.println(getName() + " has gathered " + food + " food");
		}
		else {
			System.out.println(getName() + " found no food and lost " + food + " hunger");	
		}
		
		hunger(food);
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
			System.out.println(name + " has starved to death!!!!");
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
	}//----------------------------------------//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
