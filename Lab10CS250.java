public class Lab10CS250{
    public static void main(String[] args){
        final int pSize = 10;
        int[] sized = {-51, -1, 5, 21, 36, 58, 64, 128, 256, 512};
        int[] sent = {1, 3, 5, 7, 11, 13, 17, 0, 6, 8};
        System.out.print("\nThe sized array:\n");
        printSizedArray(sized, pSize);
        System.out.print("\nThe same sized array reversed:\n");
        revArray(sized, pSize);
        printSizedArray(sized, pSize);
        System.out.print("\nThe sentinel terminated array:\n");
        printSentArray(sent, 0);
        System.out.print("\nThe same sentinel terminated array doubled:\n");
        doubArray(sent);
        printSentArray(sent, 0);
        System.out.println("");
    }
    public static void printSizedArray(int[] arr, final int eSize){
        for (int i = 0; i < eSize; ++i)
            System.out.print(arr[i] + " ");
            System.out.println("");
    }
    public static void printSentArray(int[] arr, int sentVal){
        for (int i = 0; arr[i] != sentVal; ++i)
            System.out.print(arr[i] + " ");
            System.out.println("");
    }
    public static void revArray(int[] arr, final int eSize){
        int i, t; 
        for (i = 0; i < eSize / 2; i++) { 
            t = arr[i]; 
            arr[i] = arr[eSize - i - 1]; 
            arr[eSize - i - 1] = t; 
        }
        } 
        public static void doubArray(int[] arr){
            for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * 2;
            }
    }
}