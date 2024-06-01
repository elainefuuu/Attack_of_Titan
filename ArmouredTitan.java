
package labass;

public class ArmouredTitan extends Titan{
    public ArmouredTitan() {
        this.hp = 100;
        this.attackPoint = 5;
    }
    
    public String toString() {
        return "AA";
    }
    public Titan damage(int damagePoints) {
        this.hp -= damagePoints;
        System.out.println("The Armoured Titan take damage: " + damagePoints + " points");
        System.out.println("HP of Armoured Titan: " + this.hp + " points");
        System.out.println();
        if (this.hp <= 0) {
           System.out.println("Armoured Titan died.");
            return null;
        } else {
            return this;
        }
    }
}
