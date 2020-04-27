/*
  Created in IntelliJ IDEA
  Author: YUGAM
*/

package Old.Random;

/*
Write a program to find SUM AND PRODUCT of
a given Digit.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sum_Product_ofDigit{
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader (new
                InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int num = Integer.parseInt(keyboard.readLine());
        //taking value as command line argument.
        int temp = num,result=0;
        //Logic for sum of digit
        while(temp>0){
            result = result + temp;
            temp--;
        }
        System.out.println("Sum of Digits from 1 to "+num+" is : "+result);
        //Logic for product of digit
        temp = num;
        result = 1;
        while(temp > 0){
            result = result * temp;
            temp--;
        }
        System.out.println("Product of Digits from 1 to "+num+" is : "+result);
    }
}
