/*
Mason Kaphingst
CS 250 802
Program 05
This program gives a user a menu and makes the user enter in 1 or 2  to either add zeros or ones
to a bit string and 3 to evalute the expression
*/
import java.util.Scanner;
public class Program05CS250{
    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);
        String bitString = "";
        int resultSoFar= 0;

        String operator;
        char op;
        System.out.println(bitString);
        do{
            System.out.println();
            System.out.println();
            System.out.println("           1 -> Shift Left, Add 0");
            System.out.println("           2 -> Shift Left, Add 1");
            System.out.println("           3 -> Exit, Evaluate");
            System.out.println();
            System.out.println();
            System.out.print("Choose an operator from the menu above : ");        
            operator = stdIn.next();
        
            while (operator.length() != 1 ||((op = operator.charAt(0)) < '1' || op > '3')); 
            if (op != '3'){
                if ( op == '1' ){
                    bitString = bitString + "0";
                    
                }
                else if( op == '2' ){
                    bitString = bitString + "1";
                    
                }
                System.out.println();
                System.out.println("---------------------------------------------");
                System.out.println();
            }
            if ( op != '3' )
            System.out.println(bitString);
        }
        while ( op != '3' );
        System.out.println();
        System.out.println();
        resultSoFar = Integer.parseInt(bitString,2);
        System.out.println(bitString + " = " + resultSoFar);
        System.out.println();
        stdIn.close();
    }
}