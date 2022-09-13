import sun.tools.tree.MultiplyExpression;

// Mason
// CS 250 802
// Program 02
/* This program takes the length
weight and heigh of a room
calculates it's SA and 

*/

public class Program02CS250 {
    public static void main(String[] args){

        double length = 4.26;
        double width = 4.26;
        double height = 4;
        double floorSA = width * length;
        double totalSA = (( length * width) + (length * height) + (width * height)) * 2;

        System.out.println("Given a length of " + length + " meters");
        System.out.println("a width of " + width + "  meters");
        System.out.println("and a height of " + height + "  meters");
        System.out.println("");
        System.out.println("The room's floor surface area is: " + floorSA);
        System.out.println("");
        System.out.println("The room's floor surface area is: " + floorSA);
        System.out.print("The room's total surface area is: " + (totalSA));
        
        
    }
}
