//Mason Kaphingst
// CS 251  Program #4 

public class Cards04{
    public static void main(String[] args){
        boolean[] myDeck = new boolean[52];
        final int cardsPerRow = 8;
        int cardsThisRow = 0;
        int myCard;
        initDeck(myDeck);
        System.out.println("\nHere is a shuffled deck ...\n");
        while (!emptyDeck(myDeck)){
            myCard = dealCard(myDeck);
            ++cardsThisRow;
            if (cardsThisRow <= cardsPerRow){
                printCard(myCard);
                System.out.print("  ");
            }
            else{
                System.out.println("");
                cardsThisRow = 1;
                printCard(myCard);
                System.out.print("  ");
        }
    } 
    }
    }
    public static void initDeck(boolean[] deck){
        String[] suit = { "Spade", "Diamond", "Clubs", "Hearts"};
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[52];
        for (int i = 0; i < deck.length; i++){
             deck[i] = rank[i%13] + suit[i/13];
        }
        for (int i = 0; i< ddeck.length; i++){
            int index = (int)(Math.random()*deck.length);

            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }
    public static boolean emptyDeck(boolean[] deck){
        
    }
    public static int dealCard(boolean[] deck){
        
    }
    public static void printCard(int card){

    }
}