/*A palindrome is a word that reads the same backward as forward, e.g., madam. If you start comparing the letters from the beginning with the corresponding letters from the end, they would be the same.

Given a set of words, you have to find if they are palindrome or not. */
import java.util.Scanner;

class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // number of words
        sc.nextLine();          // consume newline

        for (int i = 0; i < T; i++) {
            String word = sc.nextLine().trim();
            boolean isPalindrome = true;

            int left = 0;
            int right = word.length() - 1;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        sc.close();
    }
}