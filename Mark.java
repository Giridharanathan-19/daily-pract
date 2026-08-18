/*Grades of Student
Write a program to print the grades of 3 students based on the marks they have obtained provided as input. The student is graded A if marks are greater than 90, B if marks are greater than 70, C if greater than or equal to 40, else F.

[Note: You need to take inputs for all 3 students.]*/
import java.util.Scanner;

class Mark
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=2;i++){
		int mark=sc.nextInt();
		if(mark>90) System.out.println("A");
		else if(mark>70) System.out.println("B");
		else if(mark>=40) System.out.println("C");
		else{ 
		    System.out.println("F");
		    break;
		}
		    sc.close();
		}
	}
}
