
package labass;

import java.util.Random;

public abstract class Titan {
     //Instant variables
    //Instant variables
    
    protected int hp;
    protected int attackPoint;
    
    public int attack() {
        return this.attackPoint;
    }

    public Titan damage(int damagePoints) {
        this.hp -= damagePoints;
        if (this.hp <= 0) {
//            System.out.println("Colossus titan died. ");
            return null;
        } else {
            return this;
        }
    }
}