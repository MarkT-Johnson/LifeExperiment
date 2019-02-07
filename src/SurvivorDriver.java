import java.util.ArrayList;

public class SurvivorDriver {

	/**
	 * Main driver of LifeExperiment
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Holds the population of opposing creatures
		 */
		ArrayList<Creature> population = new ArrayList<Creature>();
		
		/**
		 * Main creature/subject, his name is Steve
		 */
		Subject steve = new Subject("Steve");
		
		//=====================================================================
		
		/**
		 * 
		 */
		while(steve.isAlive()) {
			encounters(steve.movement());
			
			steve.age();
			for(Creature creature : population) {
				creature.age();
			}
		}
		
		//System.out.println(  + " lasted " +  + " days");
	}
	
	//
	public static void encounters(double chance) {
		
		
	}
	
	

}
