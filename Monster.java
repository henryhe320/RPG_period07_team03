public class Monster extends Character {
    
    public Monster(){
        health = 125;
        strength = 20 + (int) (Math.random() * 65);
        defense = 40;
        attackRating =  0.4;
    }

}
