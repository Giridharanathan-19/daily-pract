// Given a number, find out if it is divisible by 6 or not.
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
			int a = sc.nextInt();
			if(a%6==0) System.out.println("True");
			else System.out.println("False");
		}
		sc.close();
	}
} 