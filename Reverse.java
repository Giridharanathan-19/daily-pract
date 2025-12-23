import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int rev=0;
        int temp=0;
        while(number>0){
            temp=number%10;
            rev=rev*10+temp;
            number=number/10;

        }
        System.out.println(rev);
        sc.close();
    }
    
}
