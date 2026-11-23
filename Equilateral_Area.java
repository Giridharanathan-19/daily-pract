import java.util.Scanner;

public class Equilateral_Area {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double a = obj.nextDouble();
        
        
        double sqrt3 = 1.7320508075688772;
        double area = (sqrt3 / 4.0) * a * a;
        
        System.out.printf("%.2f", area);
        obj.close();
    }
}
