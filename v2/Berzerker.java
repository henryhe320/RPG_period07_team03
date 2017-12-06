public class Berzerker extends Protagonist {
	//Class with a lot of health and defense but weak attack stats
	public Berzerker(String givenName){
		super(givenName);
		health += 80;
		defense += 30;
		attackRating -= .1;
		strength -= 30;
	}

	public String toString () {
		return super.toString() + System.lineSeparator() + "Class: Berzerker";
	}
}
