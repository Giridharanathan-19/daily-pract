/*You are having a get together at your house and your mother asks you to distribute candies equally amongst all your cousins. You want to determine if the number of candies given by your mother can be equally distributed or not. */
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Candle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int candles, cousins;
		candles=sc.nextInt();
		cousins=sc.nextInt();
		if(candles%cousins==0) System.out.println("YES");
		else System.out.println("NO");
		sc.close();
	}
}
