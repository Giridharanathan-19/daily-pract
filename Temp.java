/* Given a temperature t in Centigrade, convert it into Fahrenheit.

Formula for conversion:

Temp (℉) = (9t / 5) + 32 */


import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class temp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
			float fah=sc.nextFloat();
			float temp=((9*fah)/5)+32;
			System.out.printf("%.2f\n",temp);
		}
		sc.close();
	}
}