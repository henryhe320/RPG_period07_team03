public class Mage extends Protagonist{
	//Class able to heal itself through magic prowess
	protected float magicPower;
	
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
}
