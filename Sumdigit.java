import java.util.*;
class Sumdigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int temp;
        while(num>0){
            temp=num%10;
            sum=sum+temp;
            num=num/10;
        }
        System.out.println(sum);
        sc.close();
        
    }
}