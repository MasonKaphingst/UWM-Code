/*
Mason Kaphingst
CS250
Secotion 802
This program creates a triangle of numbers from 1-9 based on what the user entered

*/
import java.util.Scanner;
 
public class Lab07CS250{
    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many rows would you like in your pyramid? ");
        int noOfRows = sc.nextInt();
        int rowCount = 1;
        while (noOfRows < 1 || noOfRows > 9) {
            System.out.print("Invalid Input. Enter a number between 1 and 9 "); 
            noOfRows = sc.nextInt();
          }
        System.out.println("");
        for (int i = noOfRows; i > 0; i--)
        {
            for (int j = 1; j <= rowCount; j++){
                System.out.print("  ");
            }
            for (int j = noOfRows; j >= 1; j--){
                System.out.print(" "+ j);
            }             
            System.out.print(" ");
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }             
            for (int j = 1; j <= rowCount; j++){
                System.out.print("  ");
            }
        
            rowCount++;           
            System.out.println();
            noOfRows--;
        }
    }
}