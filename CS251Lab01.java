/*
Mason Kaphingst
CS251 Lab01
*/
public class SMouse{  
    private int age = 0;  
    private double weight = 1.0;  
    public void grow(){ 
        this.weight += 0.2 * this.age;    ++this.age;  
    }
    public void display(){  
     System.out.println(this.age);
     System.out.println(this.weight);
    }
}

import java.util.Scanner;
public class CS251Lab01{  
    public static void main(String[] args)   {   
        Scanner stdIn = new Scanner(System.in);  
        int ageMighty;
        SMouse mighty = new SMouse();
        
        System.out.println("What is the age of Might Mouse?");   
        ageMighty = sc.nextInt();
        printdisplay(age);
        printdisplay(weight);
        SMouse mickey = new SMouse();
        int ageMicky;
        System.out.println("What is the age of Might Mouse?");   
        ageMighty = sc.nextInt();
        printdisplay(age);
        printdisplay(weight);
        System.out.println("");    
        System.out.println("");    
        System.out.println("");  

        stdIn.close();  
    }
}
