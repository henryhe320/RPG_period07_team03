public abstract class Protagonist extends Character {
	//Default Protagonist Stats: 125/100/40/0.4 (Health/Strength/Defense/AttackRating) 
	//Warrior Stats: 85/160/20/0.4 (Health/Strength/Defense/AttackRating) 
	//Berzerker Stats: 205/70/70/0.2 (Health/Strength/Defense/AttackRating) 
	//Mage Stats: 125/100/40/0.4/0.2 (Health/Strength/Defense/AttackRating/MagicPower) 
    protected String name; 

    public String getName(){
	   return name;
    }

    public Protagonist(String givenName){
    	name = givenName;  
        health = 125;
        strength = 100;
        defense = 40;
        attackRating = 0.4;      
    }
	
	public Protagonist(String givenName, int health, int strength, int defense, double attackRating){
    	name = givenName;  
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.attackRating = attackRating;      
    }

    public abstract void specialize();

    public abstract void normalize();
	
    // Error when you make toString abstract without changing header:

    // Protagonist.java:1: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
    // public class Protagonist extends Character {
    //        ^
    // 1 error


	public abstract String toString ();
		// return "Name: " + name + System.lineSeparator() +
        // "Health/Strength/Defense/AttackRating: " + System.lineSeparator() +
		// health + "/" + strength + "/" + defense + "/" + attackRating;

    // Error when you try to instantiate an abstract class (specifically this Protagonist class):

    // Protagonist.java:52: error: Protagonist is abstract; cannot be instantiated
    // Protagonist x = new Protagonist();
    //                 ^
    // 1 error

    // public static void main (String[] args) {
    //     Protagonist x = new Protagonist();
    // }
	
}
