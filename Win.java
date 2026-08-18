/*You and your friend decide to play a game where given some numbers, you have to find the maximum number. If the maximum is an even number, you win and if it is odd, your friend wins. */
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Win
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a;
		int max=sc.nextInt();
		n--;
		while(n-->0){
			a=sc.nextInt();
			if(a>max) max=a;
		}
		if (max%2==0) System.out.println("WON");
		else System.out.println("LOST");
		sc.close();
	}
}