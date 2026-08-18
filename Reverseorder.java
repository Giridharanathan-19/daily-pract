/*Given a set of numbers, print them in the reversed order. */

import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Reverseorder {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();   // number of test cases or inputs
        int[] arr = new int[test]; // array of size 'test'

        for (int i = 0; i < test; i++) {
            int a = sc.nextInt();  // read input
            arr[i] = a;            // store in array
        }

        // Optional: print the array to verify
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
    

