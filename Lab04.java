// Mason Kaphingst
//CS250
// Lab Exercise 4
/* This program asks the user how many pens
 and notebooks they wanna buy and then displays 
 the cost of them with tax
 */

import java.util.Scanner;

public class Lab04{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Welcome to Office Min \n \n");
      
        System.out.println("How many Pens?");
        Double numberPens = stdIn.nextDouble();
    
        System.out.println("How many Notebooks?");
        Double numberNotebooks = stdIn.nextDouble();

        System.out.println("");
        System.out.println("Thank you, your bill is as follows ... \n");

        Double pensCost = (numberPens) * .5;
        Double subtotal = (numberNotebooks + (numberPens * .5));
        Double salesTax = (subtotal * .055);
        Double grandTotal = (subtotal + salesTax);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Sales tax: $" + salesTax);
        System.out.println("Grand-Total: $" + grandTotal);
        
    


    }
}
