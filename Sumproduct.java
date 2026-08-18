/*A Sum-Product Number is a natural number that is equal to the sum of all its digits multiplied by the product of all its digits.

Given a number check if it is a Sum-Product Number.

If it is a sum-product number, the output should be "Yes", and "No" otherwise. */
import java.util.Scanner;

class SumProductNumber {
    
   
    public static boolean isSumProductNumber(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        
        return sum * product == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // number of test cases
        
        for (int i = 0; i < T; i++) {
            int num = sc.nextInt();
            if (isSumProductNumber(num)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        sc.close();
    }
}