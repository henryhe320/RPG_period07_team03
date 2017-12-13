public class Acromantula extends Monster {
    
    public Acromantula(){
        health = 150;
        strength = 20 + (int) (Math.random() * 65);
        defense = 50;
        attackRating =  0.7;
    }

    public String toString(){
	return "Acromantula is no ordinary spider! Its as big as a train "
	    + "cart, is capable of speaking human speech, "
	    + "and will feast on you if you do not defeat it!"
	    + System.lineSeparator()
	    + super.toString();
    }
}
