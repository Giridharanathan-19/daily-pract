import java.util.Scanner;
public class Greatermultiple{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num=obj.nextInt();
        int res=(num-(num%10))+10;
        System.out.print(res);
        obj.close();
        
        
    }
}