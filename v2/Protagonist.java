public class Protagonist extends Character {
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

    public void specialize(){
        defense -= 10 ;
        attackRating += 1;
    }

    public void normalize(){
        defense += 1;
        attackRating -= 1;
    }
	
	public String toString () {
		return "Name: " + name + System.lineSeparator() +
        "Health/Strength/Defense/AttackRating: " + System.lineSeparator() +
		health + "/" + strength + "/" + defense + "/" + attackRating;
	}
}
