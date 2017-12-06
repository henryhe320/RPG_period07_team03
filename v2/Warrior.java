public class Warrior extends Protagonist{
	//A Class with unmatching offensive stats but weak defense stats.
	//Warrior Stats: 85/160/20/0.4 (Health/Strength/Defense/AttackRating) 
	
	public Warrior(String givenName){
		super(givenName, 85, 160, 20, 0.4);
	}

	public String toString () {
		return super.toString() + System.lineSeparator() + "Class: Warrior";
	}
}
