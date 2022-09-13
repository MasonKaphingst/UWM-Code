import java.util.Scanner;
 
public class Program06BCS250{
    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Welcome to the Pig Latin Translator!");
        System.out.println("Enter a word and I'll translate it to Pig Latin!  \n" );
        System.out.println("Wanna Play? [y/n]:" );
        String playYesOrNo = sc.nextLine();
        while (!playYesOrNo.equals("y") && !playYesOrNo.equals("n")) {
            System.out.println("Wanna Play? [y/n]:" );
            playYesOrNo = sc.nextLine();
          }
        if (playYesOrNo.equals("n")){
            System.out.println("oodGay eByay!");
        }
        else{
            System.out.print("Give me a word: ");
            String pigWord = sc.nextLine();

            if(isVowel(pigWord.charAt(0))){
                System.out.println("The word in Pig Latin is " + pigWord +"ay\nanksThay orfay ayingplay");
            }
            else{
                for (int i = 0; i <= pigWord.length(); i++) {
                    char firstChar = pigWord.charAt(0); 
                    pigWord = pigWord.substring(1);
                    pigWord = pigWord + firstChar;
                    if (i >= pigWord.length())
                    {
                        System.out.println("\nThe word in Pig Latin is: " + pigWord + "ay\nanksThay orfay ayingplay");
                    }
                }
            }
            
        }
            
        }
        public static boolean isVowel(char ch) {
            char v = Character.toLowerCase(ch);
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                return true;
            }
    
            else {
                return false;
            }
        
    }
}