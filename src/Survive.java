
public class Survive {

	public static void main(String[] args) {
	//	Creature steve = new Creature();
		Creature bob = new Creature();
		
		while(bob.isAlive()) {
			bob.age();
		}
		
		System.out.println(bob.getName()
		 + " lasted " + bob.getAge() + " days");
	}
	
	

}
