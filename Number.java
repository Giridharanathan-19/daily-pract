import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String res=a>0?"Positive":(a<0?"Negative":"Zero");
        System.err.println(res);
        sc.close();

        
    }
    
    
}
