/* Mason Kaphingst
CS 250 802
Program 04
This program gets the pitchers name and stores it as a string
it also gets the pitchers ERA and stores it as an int
*/


import java.util.Scanner;

public class Program03CS250 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("What is your first Name?");
        String firstName = stdIn.nextLine();

        System.out.println("What is your last Name?");
        String lastName = stdIn.nextLine();

        System.out.println("How man runs have you earned?");
        int runsEarned = stdIn.nextInt();

        System.out.println("How many innings have you pitched?");
        
        int inningsPitched = stdIn.nextInt();
        double era = (runsEarned * 9) / inningsPitched;

        System.out.println("Pitcher’s first name: " + firstName);
        System.out.println("Pitcher's last name: " + lastName);
        System.out.println("Number of earned runs: " + runsEarned);
        System.out.println("Number of innings pitched: " + inningsPitched);
        System.out.println(firstName + " " + lastName + " has an ERA of " + era);
        

    }
}
