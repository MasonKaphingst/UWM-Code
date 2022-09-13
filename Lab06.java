/*
Mason Kaphingst
CS 250 802
This program prompts a user to enter if they want a perscription or not a tint or not and a then creates a total for the cost of what they bought.
*/
import java.util.Scanner;
public class Lab06{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("What kind of glasses would you like:");
        System.out.print("1 -> prescription, 2 -> non-prescription :");
        int perscription = sc.nextInt();

        
        while ( perscription > 2 || perscription < 1){
            System.out.println("Invalid");
            System.out.println("1 -> prescription, 2 -> non-prescription :");
            perscription = sc.nextInt();
        }
        System.out.println("What kind of coating would you like:");
                System.out.print("1 -> anti-glare, 2 -> brown tint :");
        int tint = sc.nextInt();

        
        while (tint > 2 || tint < 1 ){
            System.out.println("Invalid");
            System.out.print("1 -> anti-glare, 2 -> brown tint :");
            tint = sc.nextInt();
        } 
        if (perscription == 1){
            if (tint == 1){
                System.out.println("Your total cost is $52.50");
            }
            else if (tint == 2){
                System.out.println("Your total cost is $49.99" );
            }
        }
        else if (perscription == 2){
            if (tint == 1){
                System.out.println("Your total cost is $37.50");
            }
            else if (tint == 2){
                System.out.println("Your total cost is $34.99" );
            }
        }
    }
}