/*
  Created in IntelliJ IDEA
  Author: YUGAM
*/

package Old.Random;

/*
Write a program to Find whether number is Prime or Not.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrimeNo{
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader (new
                InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int num = Integer.parseInt(keyboard.readLine());
        int flag=0;
        for(int i=2;i<num;i++){
            if(num%i==0)
            {
                System.out.println(num+" is not a Prime Number");
                flag = 1;
                break;
            }
        }
        if(flag==0)
            System.out.println(num+" is a Prime Number");
    }
}