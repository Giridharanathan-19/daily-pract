/*A number is known as an Armstrong number if the sum of the cubes of all its digits is equal to the number itself. */
import java.util.*;
class Armstrongtest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
        int num=sc.nextInt();
        int temp;
        temp=num;
        int temp1;
        int count=0;
        int sum=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=num;
        while (temp>0) {
            temp1=temp%10;
            sum=sum+(int) Math.pow(temp1,count);
            temp=temp/10;
            
        }
        if(num==sum) System.out.println("Yes");
        else System.out.println("No");
		}
        sc.close();
    }
}
