/*
Mason Kaphingst
CS250 
Section 802
Lab 08
This program rolls a four sided die in a game
adds a total to how many times the die rolled each side
*/
/*
*/
import java.util.Scanner;
public class Lab08CS250 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rolls (100-1000): ");
        Scanner sc = new Scanner(System.in);
        int trials = sc.nextInt();
        while (trials < 100 || numberOfRolls > 1000){
            System.out.println("Invalid, please enter a value between 100 and 100000: ");
            sc.nextInt();
        }

        int pairs = 0;
        int straights = 0;

        for (int i = 0; i <= trials; i ++){
            int roll1 = (int) (Math.random() * 4) + 1;
            int roll2 = (int) (Math.random() * 4) + 1;
            int roll3 = (int) (Math.random() * 4) + 1;
            if(roll1 == roll 2 || roll1 == roll2 || roll3 == roll1 || ){
                pairs = pairs + 1;
            }
            else if((roll1 == 1 && roll2 == 2 && roll3 == 3) || (roll1 == 2 && roll2 == 3 && roll3 == 1) ||  ){
                straights = straights + 1;
            }
            
        }
        System.out.println("straights = " + straights);
        System.out.println("pairs =" + pairs);
        
        
    }
}