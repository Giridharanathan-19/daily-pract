/*You just saw all your answer scripts after correction at school but haven't received a report card yet. So, you want to find out the percentage that you scored. Assume the total marks for each subject to be 80. */
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Percentage
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		byte test=sc.nextByte();
		byte n=test;
		int total=0;
		while(test-->0){
			byte marks=sc.nextByte();
			total+= marks;
		}
		int maxmarks=n*80;
		float percent=((float)total/maxmarks)*100;
		System.out.printf("%.2f%%",percent);
		sc.close();
	}
}