
package labass;

import java.util.Random;
import java.util.Scanner;

public class Attack_of_Titan {
    public static void main(String[] args) {
      int coins=50;
      int hour=0;
      int hp2=0;
      boolean gameStart=true;
      boolean occur1=true;
      boolean addHP;
      ArmouredTitan a=new ArmouredTitan();;
      ColossusTitan b=new ColossusTitan();
      Weapon c=new Weapon();
      int damage=0;
      String WeaponLVL1="**";
      String WeaponLVL2="$$";
      String WeaponLVL3="||";
      System.out.println("The game has started\n");
      System.out.println("No enemy yet\n");
      System.out.println("On the ground");
      System.out.println("Row");
      Random r=new Random();
      //One loop = one hour
      // The game will end once the HP of one unit of wall becomes 0
      for(int i=0; i<10; i++){
          System.out.print(i);
          if(i==0){
              System.out.printf("%45s%2d","Hour",hour);
          }
          else if(i==1){
              System.out.printf("%47s%2d","Coins:",coins);
          }
          System.out.println(" ");
      }
        System.out.print("  ");
        for(int i=0; i<10; i++){
            System.out.printf("%-4s","--" );
        }
         System.out.printf("%4s\n","The wall");
      int[]wall=new int[10];
      int[]hpWall=new int[10];
      for(int i=0; i<wall.length; i++){
          wall[i]=i;
              System.out.printf("%4d",wall[i]);
               if(i==9){
                  System.out.printf("%7s","Index");
              }
      }
        System.out.println("");
      for(int i=0; i<wall.length; i++){
              hpWall[i]=50;
              System.out.printf("%4d",hpWall[i]);
              if(i==9){
                  System.out.printf("%4s","Hp");
              }
      }
      System.out.println("");
      for(int i=0; i<10; i++){
        System.out.printf("%4s","--");
    }
        System.out.println("");
        hour++;
        coins+=5;
        
      while(hour<=6){
        System.out.println("Player's turn");
        //Upgrade weapons
        System.out.println("Choose the weapon(s) you would like to upgrade (Type a string of integer or hit Enter to skip)");
        Scanner sc=new Scanner(System.in);
        String number1 = sc.nextLine();
        int[]digits = new int[number1.length()];
        for(int i=0; i<digits.length; i++){
            digits[i]=Integer.parseInt(number1.substring(i,i+1));
        }
        int cnt0, cnt1, cnt2, cnt3, cnt4, cnt5, cnt6, cnt7, cnt8, cnt9;
        cnt0=cnt1=cnt2=cnt3=cnt4=cnt5=cnt6=cnt7=cnt8=cnt9=0;
        for(int i=0; i<digits.length; i++){
            switch(digits[i]){
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
                case 3:
                    cnt3++;
                    break;
                case 4:
                    cnt4++;
                    break;
                case 5:
                    cnt5++;
                    break;
                case 6:
                    cnt6++;
                    break;
                case 7:
                    cnt7++;
                    break;
                case 8:
                    cnt8++;
                    break;
                case 9:
                    cnt9++;
                    break;        
        }
        }
        //Upgrade walls
        System.out.println("Do you want to upgrade all walls? (Press 1 if yes, press Enter if no) Current coin number: "+coins);
        String number=sc.nextLine();
        if(number.equals("1")){
            //Add HP to walls
            System.out.println("How many HP do you want to add up to the wall(s)? Current coin number: "+ coins);
            hp2=sc.nextInt();
            for(int i=0; i<hpWall.length; i++){
                   if(coins>=hp2){ 
                      hpWall[i]+=hp2;
                      coins-=hp2;
                    } 
                   else{
                        System.out.println("Not enough money!");
                       }
            }
        }
            System.out.println("Choose the wall(s) that you would like to upgrade (Type a string of integer or hit Enter to skip)");
            String number2=sc.nextLine();
                int []hp=new int[number2.length()];
                for(int i=0; i<hp.length; i++){
                    hp[i]=Character.getNumericValue(number2.charAt(i));
                }
            for(int i=0; i<hp.length; i++){
                if(number2 instanceof java.lang.String){
                System.out.println("How many HP do you want to add up to the wall(s)? Current coin number: "+coins);
                    hp2=sc.nextInt();
               for(int j=0; j<10; j++){
                if(j==hp[i]){
                    if(coins>=hp2){
                        hpWall[j]+=hp2;
                        coins-=hp2;
                        break;
                    }
                    else{
                        System.out.println("Not enough Money!");
            }
                    }
                }
               }
                }
        for(int i=0; i<10; i++){
          System.out.print(i);
          if(i==0 && hour>5){
          switch(r.nextInt(10)){
              case 0 :
                  System.out.printf("%3s",a.toString());
                  System.out.printf("%42s%2d","Hour",hour);
                  break;
              case 1 :
                  System.out.printf("%7s",a.toString());
                  System.out.printf("%38s%2d","Hour",hour);
                  break;
              case 2 :
                  System.out.printf("%11s",a.toString());
                  System.out.printf("%34s%2d","Hour",hour);
                  break;
              case 3 :
                  System.out.printf("%15s",a.toString());
                  System.out.printf("%30s%2d","Hour",hour);
                  break;
              case 4 :
                  System.out.printf("%19s",a.toString());
                  System.out.printf("%26s%2d","Hour",hour);
                  break;
              case 5 :
                  System.out.printf("%23s",a.toString());
                  System.out.printf("%22s%2d","Hour",hour);
                  break;
              case 6 :
                  System.out.printf("%27s",a.toString());
                  System.out.printf("%18s%2d","Hour",hour);
                  break;
              case 7 :
                  System.out.printf("%31s",a.toString());
                  System.out.printf("%14s%2d","Hour",hour);
                  break;
              case 8 :
                  System.out.printf("%35s",a.toString());
                  System.out.printf("%10s%2d","Hour",hour);
                  break;
              case 9 :
                  System.out.printf("%39s",a.toString());
                  System.out.printf("%6s%2d","Hour",hour);
                  break;
          }
          }
          if(i==9 && hour>5){
           switch(r.nextInt(10)){
              case 0 :
                  System.out.printf("%3s",b.toString());
                  break;
              case 1 :
                  System.out.printf("%7s",b.toString());
                  break;
              case 2 :
                  System.out.printf("%11s",b.toString());
                  break;
              case 3 :
                  System.out.printf("%15s",b.toString());
                  break;
              case 4 :
                  System.out.printf("%19s",b.toString());
                  break;
              case 5 :
                  System.out.printf("%23s",b.toString());
                  break;
              case 6 :
                  System.out.printf("%27s",b.toString());
                  break;
              case 7 :
                  System.out.printf("%31s",b.toString());
                  break;
              case 8 :
                  System.out.printf("%35s",b.toString());
                  break;
              case 9 :
                  System.out.printf("%39s",b.toString());
                  break;
          }
              }
          if(i==0 && hour<=5){
              System.out.printf("%46s%2d","Hour:",hour);
          }
          else if(i==1){
              System.out.printf("%47s%2d","Coins:",coins);
          }
            System.out.println("");
        }
          System.out.println("");
        for(int i=0; i<10; i++){
            System.out.printf("%4s","--");
        } 
        System.out.print("  ");
        System.out.printf("%4s\n","The wall");
        for(int i=0; i<wall.length; i++){
              System.out.printf("%4d",wall[i]);
               if(i==9){
                  System.out.printf("%7s","Index");
              }
      }
        System.out.println("");
      for(int i=0; i<wall.length; i++){
              System.out.printf("%4d",hpWall[i]);
              if(i==9){
                  System.out.printf("%4s","Hp");
              }
      }
      System.out.println("");
      for(int i=0; i<10; i++){
        System.out.printf("%4s","--");
    }
        System.out.println("");
        hour++;
        coins+=5;
}
      while(hour>6){
        System.out.println("Player's turn");
        //Upgrade weapons
        System.out.println("Choose the weapon(s) you would like to upgrade (Type a string of integer or hit Enter to skip)");
        Scanner sc=new Scanner(System.in);
        String number1 = sc.nextLine();
        int[]digits = new int[number1.length()];
        for(int i=0; i<digits.length; i++){
            digits[i]=Integer.parseInt(number1.substring(i,i+1));
        }
        //Upgrade walls
        System.out.println("Do you want to upgrade all walls? (Press 1 if yes, press Enter if no) Current coin number: "+coins);
        String number=sc.nextLine();
        if(number.equals("1")){
            //Add HP to walls
            System.out.println("How many HP do you want to add up to the wall(s)? Current coin number: "+ coins);
            hp2=sc.nextInt();
            for(int i=0; i<hpWall.length; i++){
                   if(coins>=hp2){ 
                      hpWall[i]+=hp2;
                      coins-=hp2;
                    } 
                   else{
                        System.out.println("Not enough money!");
                       }
            }
        }
            System.out.println("Choose the wall(s) that you would like to upgrade (Type a string of integer or hit Enter to skip)");
            String number2=sc.nextLine();
                int []hp=new int[number2.length()];
                for(int i=0; i<hp.length; i++){
                    hp[i]=Character.getNumericValue(number2.charAt(i));
                }
            for(int i=0; i<hp.length; i++){
                if(number2 instanceof java.lang.String){
                System.out.println("How many HP do you want to add up to the wall(s)? Current coin number: "+coins);
                    hp2=sc.nextInt();
               for(int j=0; j<10; j++){
                if(j==hp[i]){
                    if(coins>=hp2){
                        hpWall[j]+=hp2;
                        coins-=hp2;
                        break;
                    }
                    else{
                        System.out.println("Not enough Money!");
            }
                    }
                }
               }
                }
        for(int i=0; i<10; i++){
          System.out.print(i);
          switch(r.nextInt(10)){
              case 0 :
                  System.out.printf("%3s",a.toString());
                  System.out.printf("%42s%2d","Hour",hour);
                  break;
              case 1 :
                  System.out.printf("%7s",a.toString());
                  System.out.printf("%38s%2d","Hour",hour);
                  break;
              case 2 :
                  System.out.printf("%11s",a.toString());
                  System.out.printf("%34s%2d","Hour",hour);
                  break;
              case 3 :
                  System.out.printf("%15s",a.toString());
                  System.out.printf("%30s%2d","Hour",hour);
                  break;
              case 4 :
                  System.out.printf("%19s",a.toString());
                  System.out.printf("%26s%2d","Hour",hour);
                  break;
              case 5 :
                  System.out.printf("%23s",a.toString());
                  System.out.printf("%22s%2d","Hour",hour);
                  break;
              case 6 :
                  System.out.printf("%27s",a.toString());
                  System.out.printf("%18s%2d","Hour",hour);
                  break;
              case 7 :
                  System.out.printf("%31s",a.toString());
                  System.out.printf("%14s%2d","Hour",hour);
                  break;
              case 8 :
                  System.out.printf("%35s",a.toString());
                  System.out.printf("%10s%2d","Hour",hour);
                  break;
              case 9 :
                  System.out.printf("%39s",a.toString());
                  System.out.printf("%6s%2d","Hour",hour);
                  break;
          }
          if(i==9 && hour>5){
           switch(r.nextInt(10)){
              case 0 :
                  System.out.printf("%3s",b.toString());
                  break;
              case 1 :
                  System.out.printf("%7s",b.toString());
                  break;
              case 2 :
                  System.out.printf("%11s",b.toString());
                  break;
              case 3 :
                  System.out.printf("%15s",b.toString());
                  break;
              case 4 :
                  System.out.printf("%19s",b.toString());
                  break;
              case 5 :
                  System.out.printf("%23s",b.toString());
                  break;
              case 6 :
                  System.out.printf("%27s",b.toString());
                  break;
              case 7 :
                  System.out.printf("%31s",b.toString());
                  break;
              case 8 :
                  System.out.printf("%35s",b.toString());
                  break;
              case 9 :
                  System.out.printf("%39s",b.toString());
                  break;
          }
              }
          if(i==0 && hour<=5){
              System.out.printf("%46s%2d","Hour:",hour);
          }
          else if(i==1){
              System.out.printf("%47s%2d","Coins:",coins);
          }
            System.out.println("");
        }
        for(int i=0; i<10; i++){
            System.out.printf("%4s","--");
        } 
        System.out.print("  ");
        System.out.printf("%4s\n","The wall");
        for(int i=0; i<wall.length; i++){
              System.out.printf("%4d",wall[i]);
               if(i==9){
                  System.out.printf("%7s","Index");
              }
      }
        System.out.println("");
      for(int i=0; i<wall.length; i++){
              System.out.printf("%4d",hpWall[i]);
              if(i==9){
                  System.out.printf("%4s","Hp");
              }
      }
      System.out.println("");
      for(int i=0; i<10; i++){
        System.out.printf("%4s","--");
    }
        System.out.println("");
        hour++;
        coins+=5;
       a.damage(damage);
       b.damage(damage);
      }
    }
    }
