/* Mason Kaphingst
CS251
Program 04
This program creates a deck, then displays it, with 
the value of the card in rows of 8
along with the suit
*/

public class CS251Program04 {
    private Card[] deck = new Card[52];
    private int cardsDealt;
    public static void main(String[] args) {
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

    
     
        //public Deck() // constructor
        // set each element of deck to a unique Card object,
        // and sets cardsDealt to zero.
        //public int getCardsDealt() // accessor
        // return the value of cardsDealt.
        //private void setCardsDealt(int cardsDealt) // mutator
        // sets cardsDealt specified value (cardsDealt)
        //public boolean isEmptyDeck()
        // returns wheather or not all the cards in deck
        // have already been dealt (cardsDealt == 52).
        //public void collectAllCards()
        //cardsDelt = 0;
        // set cardsDealt to zero.
        public Card dealCard()
        if (emptyDeck() == false) {
             cardsdealt++;
        }
        else {return null}
        // if emptyDeck() is false ...
        // returns the card at location cardsDealt in deck,
        // and increments cardsDealt by 1.
        // else ...
        // returns null
        public void shuffleDeck()
        // apply 100 random card swaps within deck
        public void shuffleDeck(int swapCnt)
        // apply swapCnt random card swaps within deck
        public static void initDeck(boolean[] deck){
            for (int i = 0; i < deck.length; i++)
            {
                deck[i] = false;
            }
        }
        // set the values of deck to indicate that they are all
        // present - not dealt yet.
        public static boolean emptyDeck(boolean[] deck){
            for (int i = 0; i < deck.length; i++)
            {
                deck[i] = true;
            }
        }
        // returns whether or not all the cards in the deck
        // have already been dealt.
        public static int dealCard(boolean[] deck){
            for (int i = 0; i < deck.length; i++)
            {
                deck[i] = true;
            }
        }

        // returns a card (an int in the range 0 to 51) at random
        // that has not been dealt since the deck was initialize
        // via intDeck.  Also notes (in deck) that this card is
        // no longer available.
        public static String cardToString(int card){
            
        }
        public static String Deck(int card){
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
        public static String SmartDeck(int card){

        }
        public static String Driver(int card){

        }
        
// given a card (an int in the range 0 to 51) returns
// an appropriate String repressentation of this card
// based on a 1-1 and onto mapping of the set [0, 51]
// to the cards described above.

public class CardGetter {  
    private String card;  
    public String getCard() {  
        return card;  
    }  
    public void setNumber(int newCard) {  
        card = newCard;  
    }  
}  
public class CardSetter {  
    private String Card;  
    public String getCard() {  
        return this.Card;  
    }  
    public void set Card(int Card) {  
        this.Card = Card;  
    }  
}     
    */    
}       

