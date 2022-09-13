/*
Mason C Kaphingst
Final Project
CS250
Section 802
This program presents a menu
*/
import java.util.Scanner;

public class CS250Final {
    //static Scanner stdIn = new Scanner(System.in);
    final static int ARRAYSIZE = 200;
    static int numWords = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to WordList!");
        System.out.println("--------------------");
        Scanner stdIn = new Scanner(System.in);
        String[] words = new String[ARRAYSIZE];
        String word =  "";
        int myChoice = getMenuChoice(stdIn);
        while ( myChoice != 4 ){
            if (myChoice == 1){
                word = stdIn.next();
                if (addWord(words, numWords, word)){
                    numWords++;
                }
            }
            else if (myChoice == 2 ){
                word = stdIn.next();
                if (removeWord(words, numWords, word)){
                    numWords--;
                }
                  
            }
            else if (myChoice == 3){
                printWords(words, numWords);
            }
            else {
                System.exit(0);
                System.out.println("Invalid Output");
            }
            myChoice = getMenuChoice(stdIn);
        }
    }
    public static boolean addWord(String[] words, int numWords, String word){
        if(findWord(words, numWords, word) != -1){
            System.out.print(word + "is already added");
            return false;
        }
        else{
            System.out.println(word + " has been added");
            words[numWords] = word;
            
            return true;
        }
    }
    //This method adds the word parameter to the words array only if words does not already contain it.
    //It returns true if word was added to words; false otherwise.
    public static boolean removeWord(String[] words, int numWords, String word){
        if(findWord(words, numWords, word) == -1){
            System.out.print(word + "does not exsist yet");
            return true;
        }
        else{
            words[numWords];
            return true;
        }
    }
    //This method removes the word parameter from the words array only if words contains it. It returns
    //true if word was found and removed from words; false otherwise.
    public static void printWords(String[] words, int numWords){
        System.out.println(numWords);
        for(int i = 0; i < numWords; i++){
            System.out.print(words[i]);
        }


    }
    //This method first sorts the elements in the words parameter, then prints them to the screen.
    private static int findWord(String[] words, int numWords, String word){
        for (int i = 0; i < numWords; i++){
            if(word == words[i]){
                return i;
            }
            else{
                return -1;
            }
            
        }
        return -1;
    }
    //This method searches for the word parameter in the words array. If found, it returns the index of
    //word; otherwise it returns -1.
    private static int getMenuChoice(Scanner stdIn){
        System.out.println("1. Add Word");
        System.out.println("2. Remove Word");
        System.out.println("3. Print Words");
        System.out.println("4. Quit \n");
        System.out.print("Chose an option (1-4) ");
        int input = 0;
        input = stdIn.nextInt();
        return input;
        
        
    }
}

    //This method prints the menu options to the screen, reads in the user’s selection, and validates it. It
    //returns the valid option selection.
