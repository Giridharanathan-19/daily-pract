import java.util.Scanner;

public class Minimum{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        
       
        for (int i = 0; i < 10; i++) {
            int num = obj.nextInt();
            if (num < min) {
                min = num;
            }
        }
        
        System.out.println(min);
        obj.close();
    }
}
