import java.util.Scanner;
public class Numberexistence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        int num=sc.nextInt();
        boolean found=false;
        while(test-->0){
            int current=sc.nextInt();
            if(current==num){
                found=true;
            }
            
        }
        if(found) System.out.print("yes");
        else System.out.println("no");
        sc.close();
    }
}