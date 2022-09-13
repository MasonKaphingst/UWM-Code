/*Mason Kaphingst
Lab 03
This program prompts the user to enter name, age, and GPA and the tells that info back to them





*/
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner (System.in);
        System.out.println("Enter your name please");
        String name = stdIn.nextLine();
        System.out.println("Enter your age, please");
        int age = stdIn.nextInt();
        System.out.println("Enter your GPA, please");
        double GPA = stdIn.nextDouble();
        System.out.println("Hello " + name);
        System.out.println("your age is " +age+ "\nyour GPA is " +GPA);



        stdIn.close();
    }
}
/* int numberOfStudents; //declare
        numberOfStudents = 15; //assignment

        double Avg= 8.5; //initialize
        //System.out.println("Number of students = " + numberOfStudents); 
        String name ="Nisreen";
        String course = "CS250";
        String space = " ";
        String empty = "";

        char ch = 'c';
        char tab = '\t'; //tab space escape char.
        char newLine = '\n'; //new line

        int a, b, c;
        a = 10; b = 2; c = 5;
        double x = 8.3;
        double z = a/x;

        System.out.println(5/2);
        System.out.println( a + (double)(c)/b); //c = 5.0 adding the (double) it's called casting, 5/2 becomes 5.0 which allows for a decimal in the answer
        double r = c % b; System.out.println(r);
        int w = 0% b; System.out.println(w);
        */
        