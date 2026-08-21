import java.util.Scanner;
public class Countelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int test=sc.nextInt();
        int num=sc.nextInt();
        while(test-->0){
            int current=sc.nextInt();
            if(current==num){
                count++;
            }
            
        }
        if(count<=0) System.out.print(-1);
        else System.out.print(count);
        sc.close();
    }
}