public class Chimera extends Monster {
    
    public Chimera(){
        health = 175;
        strength = 20 + (int) (Math.random() * 65);
        defense = 80;
        attackRating =  0.8;
    }

    public String toString(){
	return "The Chimera is fire-breathing lion, with the head"
	    +" of a goat on its back, and with a tail that has a snake's"
	    +" head! Do not attempt to domesticate it or else you'll be"
	    +" scorched!"
	    + System.lineSeparator()
	    + super.toString();
    }
}
