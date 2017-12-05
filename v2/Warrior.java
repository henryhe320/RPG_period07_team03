public class Warrior extends Protagonist{
	protected armorDefense;
	
	public Warrior(String givenName){
		super(givenName);
		armorDefense = 40;
	}
	
    public void lowerHP(int damage){
	   if (armorDefense <= damage){
		   armorDefense = 0;
	       damage -= armorDefense;
	       health -= damage
	   } else {
	       armorDefense -= damage;
	   }
    }
}