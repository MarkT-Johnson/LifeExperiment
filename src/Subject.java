
public class Subject extends Creature{
	
	public Subject() {
		
	}
	
	//=========================================================================
	
	/**
	 * Causes subject to hunger quicker and return a random number to act
	 * as a random encounter determiner
	 * @return Random number to allow the subject to experience encounters
	 */
	public double movement() {
		this.hunger(-2);
		
		return Math.random();
	}
	
	/**
	 * 
	 * @return
	 */
	public double gatherFood() {
		this.hunger();
		
	}
}
