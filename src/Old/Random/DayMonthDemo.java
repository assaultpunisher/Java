package Old.Random;
/*
Write a program to convert given no. of days into months and days.(Assume that each month is of 30 days)
Example :
    Input - 69
    Output - 69 days = 2 Month and 9 days
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DayMonthDemo{
    public static void main(String args[]) throws IOException {
        BufferedReader keyboard = new BufferedReader (new
                InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int num = Integer.parseInt(keyboard.readLine());
        int days = num%30;
        int month = num/30;
        System.out.println(num+" days = "+month+" Month and "+days+" days");
    }
}
