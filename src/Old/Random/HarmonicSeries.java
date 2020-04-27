/*
  Created in IntelliJ IDEA
  Author: YUGAM
*/

package Old.Random;

/*
Write a program to generate Harmonic Series.
    Example :
        Input - 5
        Output - 1 + 1/2 + 1/3 + 1/4 + 1/5 = 2.28 (Approximately)
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HarmonicSeries{
    public static void main(String args[]) throws IOException {
        BufferedReader keyboard = new BufferedReader (new
                InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int num = Integer.parseInt(keyboard.readLine());
        double result = 0.0;
        while(num > 0){
            result = result + (double) 1 / num;
            num--;
        }
        System.out.println("Output of Harmonic Series is "+result);
    }
}