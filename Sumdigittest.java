/*Given a number, find the sum of its digits.

If the number is represented as d1d2d3d4d5, then the sum will be d1 + d2 + d3 + d4 + d5. */
import java.util.*;


// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        while(test-- > 0) {
            int num = sc.nextInt();
            int sum = 0;  // reset sum for each test case
            
            // loop through all digits
            while(num > 0) {
                sum += num % 10;  // add last digit
                num /= 10;        // remove last digit
            }
            
            System.out.println(sum);
        }
        sc.close();
    }
}