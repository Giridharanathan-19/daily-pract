/*You are given the name and age of a person as input. You want to say "Hello" to that person along with what their age will be after one year. */
import java.util.Scanner;

class Addone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        
        System.out.println("Hello " + name + "! Next year, you will be " + (age + 1) + " years old");
        sc.close();
    }
}