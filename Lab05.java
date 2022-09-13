/*
Mason Kaphingst
CS 250 802
Lab 05

This program prompts the user for if they like spicy food
and if they like fancy food then gives suggestions based
on preferences

Problem asked in description: They are equivelent, they both ask for a answer from the user, then check 
if they have y in the answer
one creats an if then statement and determines if the answer means true or false, the other just dictates 
it as true if answered with a y
*/

import java.util.Scanner;
public class Lab05{
    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);
//
        System.out.println("CS 201 Restaurant Guide\n");
        String response;
        char s, f;
        boolean spicy, fancy;
// Ask user for his/her preference
        System.out.print("Do you like spicy food? (y / n) : ");
// Get the next token
        response = stdIn.next();
// Look only at first character
        s = response.charAt(0);
        spicy = ( s == 'y' || s == 'Y' );
        
// Ask user for his/her preference
        System.out.print("Do you want to go to a fancy restaurant? (y / n) : ");
// Get the next token
        response = stdIn.next();
// Look only at first character
        f = response.charAt(0);
        fancy = (f == 'y') || (f == 'Y');
// Make suggestion
        if ( spicy == true ){
            if (fancy == true){
                System.out.println("I suggest you go to Thai Garden Palace.");
            }
            else{
                System.out.println("I suggest you go to Alberto’s Tacqueria.");
            }
        }
        else {
            if (fancy == true){
                System.out.println("I suggest you go to Chez Paris.");
            }
            else{
                System.out.println("I suggest you go to Joe’s Diner.");
            }

        }
    }
}