import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=1&&num>=0) System.out.println(num);
        for(int i=2;i<=num;i++){
            if(num%i==0) System.out.println(i);
        }
        sc.close();
        
    }

    
}
