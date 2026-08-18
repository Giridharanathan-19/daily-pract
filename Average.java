//program to find the average of the marks using console rerader class
import java.io.*;
public class Average {
    public static void main(String[] args){
        Console con=System.console();
        Double m1=Double.parseDouble(con.readLine("Enter the mark1:"));
        Double m2=Double.parseDouble(con.readLine("Enter the mark2:"));
        Double m3=Double.parseDouble(con.readLine("Enter the mark3:"));
        Double m4=Double.parseDouble(con.readLine("Enter the mark4:"));
        Double m5=Double.parseDouble(con.readLine("Enter the mark5:"));
        Double average=(m1+m2+m3+m4+m5)/5;
        System.out.println(average);
    }
}      
    