/*Given the temperature and humidity for the day, determine which category the day's weather falls into. */
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Temphumid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
			int temp=sc.nextInt();
			int hum=sc.nextInt();
			if(temp>=30){
				if(hum>=90) System.out.println("Hot and Humid");
				else System.out.println("Hot");
			}
			else{
				if(hum>=90) System.out.println("Cool and Humid");
				else System.out.println("Cool");
			}
			
			
			
		}
		sc.close();
	}
}