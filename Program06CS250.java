/*
Mason Kaphingst
CS250 
Section 802
This program rolls a four sided die in a game
certain rolls win, the program totals up wins and losses.
*/
/*
*/
import java.util.Scanner;
public class Program06CS250 {
    public static void main(String[] args) {
        System.out.println("Welcome to Computer Dice");
        System.out.println("-----------------------------------------");
        System.out.println("You will first roll your dice");
        System.out.println("be determined:");
        System.out.println("");
        System.out.println("any Quad and you Win");
        System.out.println("any Triple and you Win");
        System.out.println("any TwoPair and you Win");
        System.out.println("any HighPair ( 4’s )and you Win");
        System.out.println("anything else and you Lose");
        System.out.println("-----------------------------------------");
        System.out.println("");
        char playYesOrNo;
        Scanner sc = new Scanner(System.in);
        int roundsWon = 0;
        int roundsLost = 0;
        int totalRounds = 0;
        do{
        int roll1 = (int) (Math.random() * 4) + 1;
        int roll2 = (int) (Math.random() * 4) + 1;
        int roll3 = (int) (Math.random() * 4) + 1;
        int roll4 = (int) (Math.random() * 4) + 1;
        boolean roll12 = (roll1 == roll2);
        boolean roll13 = (roll1 == roll3);
        boolean roll14 = (roll1 == roll4);
        boolean roll23 = (roll2 == roll3);
        boolean roll24 = (roll2 == roll4);
        boolean roll34 = (roll3 == roll4);

        
        System.out.println("");
        System.out.println("     Player     ");
        System.out.println(" -------------- ");
        System.out.print("   " + roll1 + "  ");
        System.out.print(roll2 + "  ");
        System.out.print(roll3 + "  ");
        System.out.print(roll4 + "  ");
        System.out.println("");
        
        if (roll12 && roll13 && roll14){
            System.out.println("Quad, you win!");
            roundsWon = roundsWon + 1;
            totalRounds = totalRounds + 1;
        }
        else if( (roll12 && roll13) || (roll12 && roll24) || (roll13 && roll34) || (roll23 && roll34)){
            System.out.println("Triple, you win!");
            roundsWon = roundsWon + 1;
            totalRounds = totalRounds + 1;
        }
        else if((roll12 && roll34) || (roll13 && roll24) || (roll14 && roll23)){
            System.out.println("Two pair, you win!");
            roundsWon = roundsWon + 1;
            totalRounds = totalRounds + 1;
        }
        else if((roll12 && roll1 == 4) || (roll13 && roll1 == 4) || (roll14 && roll1 == 4) || (roll23 && roll2 == 4) || (roll24 && roll2 == 4) || (roll34 && roll3 == 4)){
            System.out.println("High pair, you win!");
            roundsWon = roundsWon + 1;
            totalRounds = totalRounds + 1;
        }
        else{
            System.out.println("      Loss");
            roundsLost = roundsLost + 1;
            totalRounds = totalRounds + 1;
        }
        System.out.println("");
        System.out.print("Do you wish to play again [y,n]: ");
        playYesOrNo = sc.next().charAt(0);
        }
        while(playYesOrNo == 'y' );

        System.out.println("Computer Dice Results");
        System.out.println("-----------------------------------------");
        System.out.println("You played " + totalRounds + " rounds");
        System.out.println("");
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Rounds lost: " + roundsLost);
        System.out.println("-----------------------------------------");
    }
}