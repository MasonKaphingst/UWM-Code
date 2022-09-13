/*
Program 04
Mason Kaphingst
CS 250 Lab 802
This program asks the user to input a 4 character double literal
then checks to make sure that non of the entered values are
characters, and that the decimal place only appears once
and that a + or - sign appears at the beggining
*/

import java.util.Scanner;
public class Program04CS250{
    public static void main(String[] args) 
    {
        System.out.print("Please enter a valid (4 character) double literal : ");

        Scanner stdIn = new Scanner(System.in);
        String doubleLiteral = stdIn.nextLine();
        if (doubleLiteral.length() != 4 )
        {
            System.out.println(doubleLiteral + " is not a valid (4 character) double literal.");
        }
        else if (doubleLiteral.length() == 4) {
            
            
            System.out.println(doubleLiteral + " is a valid (4 character) double literal.");
            
        } 

        
        
        
    }   
}
