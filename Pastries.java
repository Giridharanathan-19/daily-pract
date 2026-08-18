/*You got a summer job at a bakery where you are incharge of the pastry section. Everyday you get n no. of pastries at the bakery.

There is a huge queue for buying pastries. There can be more people than you can serve so some might have to return empty handed.

You are serving each customer one after the another.

Each customer wants some number of pastries.
If you can serve that customer you need to reply with "Enjoy your dessert!".
If you cannot serve them at all, say "Sorry, we are all out!". */
import java.util.*;
import java.lang.*;
import java.io.*;

class Pastries
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int pastries = sc.nextInt();
		int customer = sc.nextInt();
		
		
		while(customer-- > 0){
			int required = sc.nextInt();
			
			
				if(pastries > 0){   
					pastries -= required;
					System.out.println("Enjoy your dessert!");
					if(pastries<0) pastries=0;
					
				}
				else System.out.println("Sorry, we are all out!");
					
					
				
			}
			
			
		
		
		sc.close();
	}
}