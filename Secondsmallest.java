import java.util.Scanner;

public class Secondsmallest{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        if (!obj.hasNextInt()) {
            System.out.println(-1);
            obj.close();
            return;
        }
        int test = obj.nextInt(); 
        
        if (test < 2) {
            if (test == 1 && obj.hasNextInt()) {
                obj.nextInt();
            }
            System.out.println(-1);
            obj.close();
            return;
        }
        
        int smallest = 0;
        int secondSmallest = 0;
        boolean trackingStarted = false;
        
        if (obj.hasNextInt()) {
            smallest = obj.nextInt();
            test--;
        }
        
        while (test-- > 0) {
            int num = obj.nextInt();
            
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
                trackingStarted = true;
            } else if (num > smallest) {
                if (!trackingStarted || num < secondSmallest) {
                    secondSmallest = num;
                    trackingStarted = true;
                }
            }
        }
        
        if (!trackingStarted) {
            System.out.println(-1);
        } else {
            System.out.println(secondSmallest);
        }
        
        obj.close();
    }
}
