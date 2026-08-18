/*Given a sentence, find out the no. of words in the sentence. You can assume that there are no whitespaces before the first word and after the last word in the sentence. */
import java.util.Scanner;

class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the entire line
        String sentence = sc.nextLine();
        
        // Split by spaces
        String[] words = sentence.split(" ");
        
        // Count words
        int count = words.length;
        
        System.out.println(count);
        
        sc.close();
    }
}