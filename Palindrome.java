import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int num=number;
        int rev=0;
        int temp=0;
        while(number>0){
            temp=number%10;
            rev=rev*10+temp;
            number=number/10;

        }
        if(num==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        System.out.println(rev);
        sc.close();
        
    }
    
}
