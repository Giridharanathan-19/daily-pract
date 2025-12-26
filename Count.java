import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=0;
        int count=0;
        int rev=0;
        while(num>0){
            temp=num%10;
            num=num/10;
            count++;
        }
        System.out.println(count);
        
        
    }
    
}
