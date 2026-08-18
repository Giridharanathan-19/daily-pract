/*Your mother has sent you to the milkman with a cylindrical bottle. You have to pay the milkman the price for the bottle full of milk at a rate of ₹40 per litre of milk. You are given the radius (r) and the height (h) of the bottle in centimetres. You can assume the value of π as 3.14. */
import java.util.*;

class Milkman{
    public static void main (String[] args) {
        final float pi = 3.14f;
        Scanner sc = new Scanner(System.in);

        float r = sc.nextFloat();
        float h = sc.nextFloat();

        float v = (pi * r * r * h)/1000;
        float amount = v * 40;

        System.out.printf("%.2f", amount); // ✅ prints like 75.36
        sc.close();;
    }
}
