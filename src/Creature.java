
public class Creature {
	/**
	 * Determines whether or not creature is alive
	 */
	private boolean alive;
	/**
	 * Determines the creature's age
	 */
	private int age;
	/**
	 * Determines how hungry the creature is
	 */
	private int hunger;
	/**
	 * Keeps a count of the number of creatures
	 */
	private static int number = 0;
	/**
	 * Which creature number this creature is
	 */
	private int creatureNumber;
	/**
	 * The name of the creature
	 */
	private String name;
	
	//=========================================================================
	
	/**
	 * Constructs A creature with a specific name
	 * @param name The name of the creature
	 */
	public Creature(String name) {
		alive = true;
		age = 0;
		hunger = 100;
		this.name = name;
		number++;
		creatureNumber = number;
	}
	/**
	 * Creates a creature where the name of the creature is creatureNumber
	 */
	public Creature() {
		alive = true;
		age = 0;
		hunger = 100;
		number++;
		creatureNumber = number;
		name = String.valueOf(creatureNumber);
	}
	
	//=========================================================================
	
	/**
	 * Changes the amount of hunger the creature has left and sets alive
	 * to false if the creature hits zero hunger
	 * @param value The amount to change the hunger by
	 */
	public void hunger(int value) {
		hunger = hunger + value;
		if(hunger <= 0) {
			alive = false;
		}
	}
	
	/**
	 * Reduces the creature's hunger by one
	 */
	public void hunger() {
		hunger--;
		if(hunger <= 0) {
			alive = false;
		}
	}
	
	/**
	 * Ages the creature by one
	 */
	public void age() {
		age++;
	}
	
	//=========================================================================

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Creature.number = number;
	}

	public int getCreatureNumber() {
		return creatureNumber;
	}

	public void setCreatureNumber(int creatureNumber) {
		this.creatureNumber = creatureNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
