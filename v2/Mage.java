public class Mage extends Protagonist{
	//Class able to heal itself through magic prowess
	//Mage Stats: 125/100/40/0.4/0.2 (Health/Strength/Defense/AttackRating/MagicPower) 
	protected double magicPower;
	
	public Mage(String givenName){
		super(givenName); //Uses default constructor since Mage Stats are equal to the default stats + a class unique attribute called magicPower which allows Mages to heal. 
		magicPower = .2;
	}
	
	public void useHealthPotion () {
		health += 20 * magicPower;
	}
	
	public void learnMoreMagic () {
		magicPower *= 1.5;
	}

	public String toString () {
		return super.toString() + System.lineSeparator() + "Class: Mage/Magic Power: " + magicPower;
	}
}
