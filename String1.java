import java.util.*;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        while (true) {
            try  {
                str.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
            
        }
        
        System.out.println(count);
    
    sc.close();
    }
    

}
