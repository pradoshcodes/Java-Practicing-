// The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

// You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
// Function Description

// Complete the findDay function in the editor below.

// findDay has the following parameters:

// int: month
// int: day
// int: year
// Returns

// string: the day of the week in capital letters
// Input Format

// A single line of input containing the space separated month, day and year, respectively, in    format.

// Constraints

// Sample Input

// 08 05 2015
// Sample Output

// WEDNESDAY
// Explanation

// The day on August th  was WEDNESDAY.

// Language
// Java 8
// More
// 15161718192021222324252627282930313233341413121
//        return day_of_week[p-1];

//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

// Line: 30 Col: 30

// Test against custom input
// Java
// You have earned 15.00 points!
// You are now 37 points away from the 4th star for your java badge.
// 47%113/150
// Congratulations
// You solved this challenge. Would you like to challenge your friends?Share on FacebookShare on TwitterShare on LinkedIn

// Test case 0

// Test case 1

// Test case 2

// Test case 3

// Test case 4

// Test case 5
// Compiler Message
// Success
// Input (stdin)
// 08 05 2015
// Expected Output
// WEDNESDAY

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*  if you want to know about calendar object then go to this link https://www.javatpoint.com/java-util-calendar.
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String[] day_of_week={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        Calendar cl=Calendar.getInstance();
        cl.set(year,month-1,day);
       int p= cl.get(Calendar.DAY_OF_WEEK);
       return day_of_week[p-1];

    }

}

public class Problem9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
