/*A n digit number N is known as a Narcissistic number if the sum of all its digits raised to the power of n is equal to the number itself. */
import java.util.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Narcissitic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {
            int num = sc.nextInt();
            int original = num;
            int digits = String.valueOf(num).length();
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }

            if (sum == original) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}