public class Mage extends Protagonist{
	//Class able to heal itself through magic prowess
	protected double magicPower;
	
	public Mage(String givenName){
		super(givenName);
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
