/*
Mason Kaphingst
CS250 
Section 802
Program 08
This program rolls a four sided die in a game
certain rolls win, the program totals up wins and losses.
*/
import java.util.Scanner;
public class Program08CS250 {
    public static void main(String[] args) { 
    printwelcome();
    

    }

public static void welcome(){
    System.out.println("Welcome to Mason's Betting Arena \n");
    System.out.println("Number Bets Payout: 35:1 \n");
    System.out.println("Color Bets Payout: 1:1: \n");
    System.out.println("What would you like to bet on; Color or Number?: \n");
    system.out.println("Enter a choice [1-3]:");
}
public static int getMenuChoice(Scanner stdIn)
    Scanner numberOrColor = new Scanner(System.in);
    playColorOrNumber = sc.next();
    while(playColorOrNumber == '1');
        System.out.print
    return numberOrColor;
public static int getNumber(Scanner stdIn){
    Scanner number = new Scanner(System.in);
    System.out.println("Enter the color to bet on [Red or Black]: \n");
    return number;
}
public static String getColor(Scanner stdIn){
    Scanner color = new Scanner(System.in);
    System.out.println("Enter the number to bet on [1-36]:  \n");

    return color;
}
public static int getBet(Scanner stdIn, int chipsNow);{
    Scanner betAmount = new Scanner(System.in);
    System.out.println("Enter the amount you would like to bet [1-" + chipsOwned + "] \n");

    
}
public static String determineColor(int spinNum){
    int rouletteWheel = (int) (Math.random() * 37);
    return rouletteWheel;
}
public static void report(int chipsNow){
    System.out.println("");
}
}