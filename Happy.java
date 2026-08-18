/*Alice and Marks
Alice has scored 
X
X marks in her test and Bob has scored 
Y
Y marks in the same test. Alice is happy if she scored at least twice the marks of Bob’s score. Determine whether she is happy or not. */
import java.util.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// write your code here
		if (x >= 2 * y) {
            System.out.println("YES");
        }
        else System.out.println("NO");
        sc.close();
		
	}
}
