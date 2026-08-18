/*Your father has given you some money and you are trying to decide what you want to do with that money. Your friend gives you the idea of an investment that gives you simple interest for your money. */
import java.util.*;
import java.lang.*;
import java.io.*;

class Simpleinterest {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();  // Principal
        double t = sc.nextDouble();  // Time
        double r = sc.nextDouble();  // Rate (as percentage)

        double interest = (p * r * t) / 100;  // Correct formula

        System.out.printf("%.6f\n", interest);  // Print with 6 decimal places

        sc.close();
    }
}
