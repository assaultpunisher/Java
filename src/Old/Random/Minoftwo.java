/*
  Created in IntelliJ IDEA
  Author: YUGAM
*/

package Old.Random;

/*
To find minimum of 2 Numbers using ternary operator
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Minoftwo{
    public static void main(String args[]) throws IOException {
        //taking value as command line argument.
        //Converting String format to Integer value
        BufferedReader keyboard = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Enter First Number:");
        int i= Integer.parseInt (keyboard.readLine());
        System.out.println("Enter Second Number:");
        int j= Integer.parseInt (keyboard.readLine());
        int result = (i<j)?i:j;
        System.out.println(result+" is a minimum value");
    }
}
