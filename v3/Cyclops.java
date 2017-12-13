public class Cyclops extends Monster {
    
    public Cyclops(){
        health = 200;
        strength = 20 + (int) (Math.random() * 65);
        defense = 60;
        attackRating =  0.6;
    }

    public String toString(){
	return "Beware of the Cyclop. A monstrous ogre, it will wreck "
	    +" havoc all around and will step on you like a bug!"
	    + System.lineSeparator()
	    + super.toString();
    }
}

