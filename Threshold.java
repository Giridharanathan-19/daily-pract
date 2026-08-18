/*Chef and Brain Speed
In ChefLand, human brain speed is measured in bits per second (bps). Chef has a threshold limit of 
X
X bits per second above which his calculations are prone to errors. If Chef is currently working at 
Y
Y bits per second, is he prone to errors?

If Chef is prone to errors print YES, otherwise print NO. */
import java.util.*;



class Threshold
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// write your code here
		if(y>x) System.out.println("YES");
		else System.out.println("NO");
        sc.close();
		
		
	}
}
