public class Berzerker extends Protagonist {
	//Class with a lot of health and defense but weak attack stats
	//Berzerker Stats: 205/70/70/0.2 (Health/Strength/Defense/AttackRating) 
	public Berzerker(String givenName){
		super(givenName, 205, 70, 70, 0.2);
	}

	public String toString () {
		return "Name: " + name + System.lineSeparator() +
        "Health/Strength/Defense/AttackRating: " + System.lineSeparator() +
		health + "/" + strength + "/" + defense + "/" + attackRating +
		System.lineSeparator() + "Class: Berzerker";
	}

	public void specialize(){
		//Can add unique values if wanted
        defense -= 10 ;
        attackRating += 1;
    }

    public void normalize(){
    	//Can add unique values if wanted
        defense += 1;
        attackRating -= 1;
    }
}
