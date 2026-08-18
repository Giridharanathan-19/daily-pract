/*Given a number n, you have to print the multiplication table of n till the 10th multiple. */
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Multiplytable
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
			int num=sc.nextInt();
			
			for(int i=1;i<=10;i++){
				System.out.print(i*num+" ");
			}
			System.out.println();
			
		}
		sc.close();
	}
}