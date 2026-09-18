import java.util.Scanner;

public class FirstLastDigitNoBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int temp = n;
        int digits = 0;

      
            temp /= 10;
            digits++;
        }

       
        int lastDigit = n % 10;

        // Extract first digit
        int firstDigit = n;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        if (firstDigit % 2 != 0 && lastDigit % 2 == 0) {
          
            int power = 1;
            for (int i = 1; i <= digits - 1; i++) {
                power *= 10;
            }

            int middlePart = (n % power) / 10;

          
            int swapped = lastDigit * power + middlePart * 10 + firstDigit;
            System.out.println("Swapped number: " + swapped);
        } else {
            int sum = firstDigit + lastDigit;
            System.out.println("Sum of first and last digit: " + sum);
        }

        sc.close();
    }

