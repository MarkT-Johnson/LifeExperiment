import java.util.ArrayList;

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
	 * Keeps a count of the number of creatures
	 */
	private static int number = 0;
	/**
	 * Which creature number this creature is
	 */
	private int creatureNumber;
	/**
	 * Strength of a creature for combat
	 */
	private int strength;

	//=========================================================================
	/**
	 * Creates a creature
	 */
	public Creature() {
		alive = true;
		age = 1;
		creatureNumber = number;
		number++;
		strength = (int)(Math.random() * 6);
	}

	//=========================================================================

	/**
	 * Ages the creature by one
	 */
	public void age() {
		if(isAlive()) {
			if(Math.random() > 0.75) {
				strength++;
			}
			age++;
			if(age > 100) {
				setAlive(false);
			}
		}
	}

	//=========================================================================

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	//----------------------------------------//
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//----------------------------------------//
	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Creature.number = number;
	}
	
	public static void updateNumber(ArrayList<Creature> pop) {
		
	}
	//----------------------------------------//
	public int getCreatureNumber() {
		return creatureNumber;
	}

	public void setCreatureNumber(int creatureNumber) {
		this.creatureNumber = creatureNumber;
	}
	//----------------------------------------//
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

}
