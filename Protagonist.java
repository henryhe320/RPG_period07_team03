public class Protagonist extends Character {
    protected String name; 

    public String getName(){
	   return name;
    }

    public Protagonist(String givenName){
    	name = givenName;  
        health = 125;
        strength = 100;
        defense = 40;
        attackRating = 0.4;      
    }

    public void specialize(){
        defense -= 10 ;
        attackRating += 10;
    }

    public void normalize(){
        defense = 40;
        attackRating = 0.4;
    }
}
