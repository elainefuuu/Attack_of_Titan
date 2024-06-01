
package labass;
import java.util.*;

public class Weapon {
//Instant variables
    private int level;
    private int attack;
    //Constructors(level & attack by default = 0)
    public Weapon(){
    }
    public int Upgrade(int x){
       if(x==1){
        this.level=1;
        this.attack=2;
       }
       else if(x==2){
        this.level=2;
        this.attack=5;
       }
      else if(x==3){
        this.level=3;
        this.attack=10;
    }
      else if(x>3){
           System.out.println("Your weapon reach the maximum level!");
      }
      else{
          return 0;
      }
       return x;
    }
}
