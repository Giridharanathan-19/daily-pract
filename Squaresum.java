/*Given a number, find out the sum of squares of all its digits.

If the number is represented as d1d2d3, then the sum will be d12 + d22 + d32 */
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Squaresum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
			int num=sc.nextInt();
			int sum=0;
			while(num>0){
				int digit=num%10;
				sum+=(digit*digit);
				num=num/10;
				
			}
			System.out.println(sum);
		}
		sc.close();
	}
}