/*
Mason Kaphingst
CS250
Program 09
This program using methods creates a deck of cards giving each
card a value and a suit, and then shuffles after displaying the deck
unshuffled

*/
import java.util.ArrayList;
public class Program09CS250 {
    static int[] deck = new int[36];
    public static void main(String[] args) { 
        System.out.println("\nAfter init Deck\n");
        System.out.println("***********************************");
        initDeck(deck);
        displayDeck(deck);
        System.out.println("After shuffleDeck\n");
        System.out.println("***********************************");
        shuffleDeck(deck , 35);
        displayDeck(deck);
    }
    public static int cardValue(int card){
        return card % 9 + 1;
    }
    //Return the integer value ( [1, 9] ) of card
    public static String cardSuit(int card){
        int suit= card/9;
            if( suit ==0)
                return "Club";
            else if ( suit == 1)
                return "Spade";
            else if ( suit == 2)
                return "Heart";
            else
                return "Diamond";
            
    }
    //Return the suit ( [”Club”, ”Spade”, ”Heart”, ”Diamond”] ) of card
    public static void displayCard(int card){
        System.out.println(cardValue(card) + " " + cardSuit(card));
    }
    //Prints card (both value and suit) in some reasonable report format.
    public static void initDeck(int[] deck){
        
        for(int i = 0; i < deck.length; i++){
            deck[i] = i;
        }
    }
    //Assign the elements of deck, such that each element’s value is the same as its index.
    public static void shuffleDeck(int[] deck, int n){
       
        for(int i = 0; i < n; i++){
            int k = (int) (Math.random() * 35) + 1;
            int j = (int) (Math.random() * 35) + 1;
            int swap = deck[k];
            deck[k] = deck[j];
            deck[j] = swap;
        }
    }
    //The following is performed exactly n times:
    //1. Generate two random numbers j and k - each in the range [0, 35]
    //2. Swap the values of the deck array at indicies j and k
    public static void displayDeck(int[] deck){
        for(int i = 0; i < deck.length; i++){
            displayCard(deck[i]);
         }
         System.out.print("\n");
    }
}
    //Prints the cards in deck in some reasonable report format.