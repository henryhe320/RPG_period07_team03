public class Warrior extends Protagonist{
	//A Class with unmatching offensive stats but weak defense stats.
	//Warrior Stats: 85/160/20/0.4 (Health/Strength/Defense/AttackRating) 
	
	public Warrior(String givenName){
		super(givenName, 85, 160, 20, 0.4);
	}


	// Error when abstract method is not overridden:

	// Warrior.java:1: error: Warrior is not abstract and does not override abstract method toString() in Protagonist
	// public class Warrior extends Protagonist{
	//        ^
	// 1 error

	public String toString () {
		return "Name: " + name + System.lineSeparator() +
        "Health/Strength/Defense/AttackRating: " + System.lineSeparator() +
		health + "/" + strength + "/" + defense + "/" + attackRating +
		System.lineSeparator() + "Class: Warrior";
	}


}
