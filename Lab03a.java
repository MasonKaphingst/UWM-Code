// Mason

// CS 250 802
// Lab Exercise 3 part a
// This program is designed to take a Fahrenheit temperature as input
// and output the equivalent Celsius temperature.
// import the Scanner class


import java.util.Scanner;

public class Lab03a {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Enter temperature (degrees Fahrenheit): ");
        double fahrenheit;    
        fahrenheit = stdIn.nextDouble();
        double celsius = (fahrenheit - 32) * 5 /9 ;
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius");

        stdIn.close();
    }
}



/* Create an input scanner for keyboard
Scanner stdIn = new Scanner(System.in);
// Declare fahrenheit variable
double fahrenheit;
// Prompt for temperature in degrees Fahrenheit.
System.out.print("Enter temperature (degrees Fahrenheit): ");
// Get the fahrenheit value from the user
fahrenheit = stdIn.nextDouble();
// Declare celsius variable
// Convert the Fahrenheit temperature to Celsius.
// Output the results of the conversion in this format:
// "<fahrenheit> degrees Fahrenheit is equal to <celsius> degrees Celsius."
// The values in <> are the value entered and the converted value.
// Close the input scanner
stdIn.close();
}
}
*/