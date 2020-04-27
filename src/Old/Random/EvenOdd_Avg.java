/*
  Created in IntelliJ IDEA
  Author: YUGAM
*/

package Old.Random;

/*
Write a program to find average of consecutive N Odd no. and Even no.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class EvenOdd_Avg{
    public static void main(String args[]) throws IOException {
        BufferedReader keyboard = new BufferedReader (new
                InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int n = Integer.parseInt(keyboard.readLine());
        int cntEven=0,cntOdd=0,sumEven=0,sumOdd=0;
        while(n > 0){
            if(n%2==0){
                cntEven++;
                sumEven = sumEven + n;
            }
            else{
                cntOdd++;
                sumOdd = sumOdd + n;
            }
            n--;
        }
        int evenAvg,oddAvg;
        evenAvg = sumEven/cntEven;
        oddAvg = sumOdd/cntOdd;
        System.out.println("Average of first N Even no is "+evenAvg);
        System.out.println("Average of first N Odd no is "+oddAvg);
    }
}
