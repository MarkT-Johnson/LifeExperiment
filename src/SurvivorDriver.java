import java.util.ArrayList;

public class SurvivorDriver {

	/**
	 * Holds the living population of creatures
	 */
	private static ArrayList<Creature> population = new ArrayList<Creature>();

	/**
	 * Main creature/subject, his name is Steve
	 */
	private static Subject steve = new Subject("Steve");
	
	/**
	 * Main driver of LifeExperiment
	 * @param args
	 */
	public static void main(String[] args) {

		//=====================================================================

		population.add(0, steve);
		System.out.println(steve.getName() + " is born!!!");

		//Main loop driving the experience
		while(steve.isAlive()) {
			System.out.println("A new day begins for " + steve.getName());
			
			encounters(steve.movement());
			if(steve.getHunger() < 35 && steve.isAlive()) {
				steve.gatherFood();
			}

			for(int i = 0; i < population.size(); i++) {
				
				//Random death to other creatures
				if(Math.random() > 0.9) {
					population.get(i).setAlive(false);
				}
				population.get(i).age();
			}
			
			System.out.println();
		}

		System.out.println(steve.getName() + " lasted " + steve.getAge() + " days");
	}

	public static void encounters(double chance) {
		System.out.println(steve.getName() + " has seen something...");
		
		//If this chance occurs the subject and a random creature go into combat, the one with the higher strength wins
		if(chance <= 1.0 && chance >= 0.9) {
			System.out.println(steve.getName() + " has encountered a hostile creature!!!!!");
			
			//The creature the subject is to fight randomly determined
			int combatant = 1 + (int) Math.random() * ((Creature.getNumber() - 1) +1);
			
			//The creature defeats the subject
			if(population.get(combatant).getStrength() > steve.getStrength()) {
				steve.setAlive(false);
				System.out.println(steve.getName() + " has died to creature number " + population.get(combatant).getCreatureNumber());
			}
			
			//The subject defeats the creature
			else {
				population.get(combatant).setAlive(false);
				steve.hunger(-4);
				System.out.println(steve.getName() + " has defeated creature number " + population.get(combatant).getCreatureNumber());
			}
		}
		
		else if(chance < 0.9 && chance >= 0.8) {
			System.out.println(steve.getName() + " has found some food!\n+3 to Hunger");
			steve.hunger(3);
		}
		else {
			System.out.println("Huh, it must have been nothing");
		}
	}
	//TODO Add in a random number of creatures to be auto generated
	public static void generateCreatures() {
		
	}



}
