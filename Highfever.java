/*It is the year 2020 and your father owns a restaurant. You have decided to spend time helping him out in the COVID-19 pandemic situation. You have been conducting temperature checks for all the workers and the delivery boys at the restaurant. A temperature above 98.6℉ is considered high and you need to flag it to your father with a list of employees with high temperatures. */
import java.util.*;
import java.lang.*;
import java.io.*;

class Highfever {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of employees
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String name = sc.next();       // employee name
            double temp = sc.nextDouble(); // temperature

            if (temp > 98.6) {
                if (result.length() > 0) {
                    result.append(", ");   // add separator before next name
                }
                result.append(name);
            }
        }

        System.out.println(result.toString());
        sc.close();
    }
}