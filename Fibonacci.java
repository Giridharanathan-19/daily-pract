import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int num = sc.nextInt();

        int current = 0;
        int next = 1;

        for (int i = 0; i < num; i++) {
            System.out.println(current);
            int fib = current + next;
            current = next;
            next = fib;
        }

        sc.close();
    }
}
