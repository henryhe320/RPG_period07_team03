public class Warrior extends Protagonist{
	//A Class with unmatching offensive stats but weak defense stats.
	public Warrior(String givenName){
		super(givenName);
		strength += 60;
		health -= 40;
		defense -= 20;
	}
}
