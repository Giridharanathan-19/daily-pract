import java.util.*;

class Triangle {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();  // number of test cases
        
        while (test-- > 0) {
            int L1 = sc.nextInt();
            int L2 = sc.nextInt();
            int L3 = sc.nextInt();
            
            // Check triangle condition
            if ((L1 + L2 >= L3) && (L1 + L3 >= L2) && (L2 + L3 >= L1)) {
                int circumference = L1 + L2 + L3;
                System.out.println(circumference);
            } else {
                System.out.println("-1");
            }
        }
        
        sc.close();
    }
}