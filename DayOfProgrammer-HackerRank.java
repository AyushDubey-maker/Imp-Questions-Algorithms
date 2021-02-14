import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dayOfProgrammer {
    //Tip(Hint):Got confused if to take an array//but no need date is 12 or 13 only;
    //for(1918) date==26.09.1918
    static String solve(int year){
        String date = "";
        if(year < 1918) {                                                   //Julian check for leap year
            date += (year % 4 == 0) ? "12.09." + year : "13.09." + year;
        } else if(year == 1918) {                                           //Special case: transition year
            date += "26.09." + year;                                        //Gregorian check for leap year
        } else {   
        	
            date += ((year % 400 == 0) ||                               //Divisible by 400
            (year % 4 == 0 && year % 100 != 0)) ? "12.09." + year : "13.09." + year; //By 4 and not by 100.!!!
        }
        return date;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the required Year:");
        int year = in.nextInt();
        String result = solve(year);
        System.out.println("Day Of Programmer for year: "+year);
        System.out.println(result);
    }
}

Output:

Enter the required Year:
2021
Day Of Programmer for year: 2021
13.09.2021

