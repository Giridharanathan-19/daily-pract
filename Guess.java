/*You just made a new friend at school and he is trying to guess your birthday. He has already guessed the month and year of your birth, and is now trying to guess the date d */
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Guess
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int date=sc.nextInt();
		while(true){
			int guess=sc.nextInt();
			if(guess==date){
				System.out.println("Correct Guess");
				break;
			}
			else System.out.println("Incorrect Guess");
		}
		sc.close();
	}
}
