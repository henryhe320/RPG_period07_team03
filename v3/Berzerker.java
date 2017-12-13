public class Berzerker extends Protagonist {
	//Class with a lot of health and defense but weak attack stats
	//Berzerker Stats: 205/70/70/0.2 (Health/Strength/Defense/AttackRating) 
	public Berzerker(String givenName){
		super(givenName, 205, 70, 70, 0.2);
	}

	public String toString () {
		return super.toString() + System.lineSeparator() + "Class: Berzerker";
	}
}
