import java.util.Scanner;
public class Oddevendiff {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        int diff=num1-num2;
        if((diff%2)==0) System.out.print("even");
        else System.out.print("odd");
        obj.close();
       
    }
}