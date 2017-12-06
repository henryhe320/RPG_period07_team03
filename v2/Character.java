public class Character {
    protected int health;
    protected int strength;
    protected int defense;
    protected double attackRating;

    public boolean isAlive(){
	   return health > 0;
    }

    public int getDefense(){
	   return defense;
    }

    public void lowerHP(int damage){
	   health -= damage;
    }
    
    public int attack(Character characterToAttack){
    	int damage = (int) (strength * attackRating)
	                 - characterToAttack.getDefense();
    	characterToAttack.lowerHP(damage);
        return damage;
    }

    // public String toString () {
    //     return "Health/Strength/Defense/AttackRating: " + System.lineSeparator() +
    //     health + "/" + strength + "/" + defense + "/" + attackRating;
    // }
}
