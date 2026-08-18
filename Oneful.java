/*Oneful Pairs
Chef defines a pair of positive integers 
if,
a+b+(a⋅b)=111
output Yes if they are a 
Oneful Pair
Oneful Pair. And No otherwise. */
import java.util.*;
import java.lang.*;
import java.io.*;


class Oneful
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// write your code here
		int result=(a+b)+(a*b);
		if(result==111) System.out.println("Yes");
		else System.out.println("No");
		sc.close();
		
	}
}

