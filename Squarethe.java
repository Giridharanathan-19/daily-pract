/*Given a number, you have to determine the square of that number. */
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Squarethe
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
			int num=sc.nextInt();
			System.out.println(num*num);
		}
		sc.close();
	}
}