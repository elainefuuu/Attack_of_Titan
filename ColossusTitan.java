
package labass;

public class ColossusTitan extends Titan {
    public ColossusTitan() {
        this.hp = 50;
        this.attackPoint = 10;
    }
    public String toString() {
        return "CC";
    }
    public Titan damage(int damagePoints) {
        this.hp -= damagePoints;
        System.out.println("The Colossus Titan take damage: " + damagePoints + " points");
        System.out.println(" HP of Colossus Titan: " + this.hp + " points");
        System.out.println();
        if (this.hp <= 0) {
          System.out.println("Colossus Titan died.");
            return null;
        } else {
            return this;
        }
    }
}
