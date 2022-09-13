import java.util.Scanner;
public class Practicequiz.java
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
final int Size = 10;
double [] scores = new double[Size];
// set all the scores to a random number [0 - 99]
for (int s = 0; s < Size; ++s)
scores[s] = (int)(Math.random() * 100);
// print the scores - original order
System.out.println("Scores - Original");
System.out.println("------------------");
printArray(scores, Size);
System.out.println("\n");
// sort the scores
System.out.println("Sorting ...\n");
// print the scores - sorted order
System.out.println("Scores - Sorted");
System.out.println("----------------");
printArray(scores, Size);
System.out.println("\n");
stdIn.close();
}
public static void printArray(double [] arr, int eSize)
{
for (int i = 0; i < eSize; ++i)
System.out.println(arr[i]);
}
public static int findMinLoc(double [] arr, int startInd, int endInd)
{
int minLoc = startInd;
for (int i = startInd + 1; i <= endInd; ++i)
{
if (arr[i] < arr[minLoc])
minLoc = i;
}
return minLoc;
}
public static void swapInArray(double [] arr, int ind1, int ind2)
{
double tmp = arr[ind1];
arr[ind1] = arr[ind2];
arr[ind2] = tmp;
}
public static void sortArray(double [] arr, int eSize)
{
for (int i = 0; i < eSize; ++i)
{
int ind = findMinLoc(arr, i, eSize-1);
swapInArray(arr, i, ind);
}
}
}