/*You had your birthday party last night and received a lot of candies. You do not want keep so many and decide to distribute it among your friends. To make things interesting, you plan to give each friend a number of candies equal to the number of vowels in thier first name.

You can assume that the first name of your friends consists of only one word (no spaces or special characters) and you have enough candies for each of them.

You have to determine how many candies each of your friend gets.

Input Format
First line has a number n representing the number of your friends.

n lines follow with the first name of each of your friends all in separate lines.

Output Format
n lines, each indicating the number of candies the person received. */
import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of friends
        sc.nextLine();          // consume newline

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int count = 0;

            // count vowels directly
            for (int j = 0; j < name.length(); j++) {
                char ch = Character.toLowerCase(name.charAt(j));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}