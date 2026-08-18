/*Water Consumption
Recently, Chef visited his doctor. The doctor advised Chef to drink at least 
2000
2000 ml of water each day.

Chef drank 
X
X ml of water today. Determine if Chef followed the doctor's advice or not. */
import java.util.*;



class Water
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		// write your code here
    		if(x>=2000) System.out.println("YES");
    		else System.out.println("NO");
		}
		sc.close();
		
	}
}
