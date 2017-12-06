public class Protagonist extends Character {
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
