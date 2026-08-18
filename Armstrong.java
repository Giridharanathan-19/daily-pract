import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp;
        temp=num;
        int temp1;
        int count=0;
        int sum=0;
        while(temp>0){
            temp=temp/10;
            count++;
        temp=num;
        while (temp>0) {
            temp1=temp%10;
            sum=sum+(int) Math.pow(temp1,count);
            temp=temp/10;
            
        }
        if(num==sum) System.out.println("Armstrong");
        else System.out.println("No");
        sc.close();
    }
}
}
