/* Mason Kaphingst
CS250 802
This program



***********************************************************************************************************/



import java.util.Scanner;
public class CS250Practice{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of hours you worked this week : ");
        Scanner stdIn = new Scanner(System.in);
        int hoursWork = stdIn.nextInt();

        System.out.println("Enter your hourly wage $");
        double payRate = stdIn.nextDouble();

        System.out.println(hoursWork + " hours of work at an hourly wage of $" + payRate + "results in:");
        double regularPay = (payRate * hoursWork);
        if (hoursWork <= 40) {
            System.out.println("$" + regularPay + " of regular pay");
            System.out.println("$0 of overtime pay");

        }
        else if (hoursWork > 40) {
            double overtimePay = (regularPay + ((hoursWork-40)* (payRate *1.5)));
            System.out.println("$" + regularPay + " of regular pay");
            System.out.println("$" + (overtimePay - regularPay) + " of overtime pay");
        }


        

    }
}
