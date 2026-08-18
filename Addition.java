/*Your task is very simple: given two integers A and B write a program to add these two numbers and output the sum. */
import java.util.*;



class Addition
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		// write your code here
    		System.out.println(a+b);
		}
		sc.close();
	}
}
