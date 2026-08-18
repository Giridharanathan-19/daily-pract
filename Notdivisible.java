/*Given a number n, print all the numbers that from 1 to n that are not divisible by 3. */
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Notdivisible
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
			int num=sc.nextInt();
			for(int i=1;i<=num;i++){
				if(i%3!=0) System.out.print(i+" ");
				
			}
			System.out.println();
		}
		sc.close();
	}
}