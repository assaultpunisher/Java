package Random;
/*
Write a program to find whether given no. is Random.Armstrong or not.
   Example :
        Input - 153
        Output - 1^3 + 5^3 + 3^3 = 153, so it is Random.Armstrong no.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Armstrong{
    public static void main(String args[]) throws IOException {
        BufferedReader keyboard = new BufferedReader (new
                InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int num = Integer.parseInt(keyboard.readLine());
        int n = num; //use to check at last time
        int check=0,remainder;
        while(num > 0){
            remainder = num % 10;
            check = check + (int)Math.pow(remainder,3);
            num = num / 10;
        }
        if(check == n)
            System.out.println(n+" is an Random.Armstrong Number");
        else
            System.out.println(n+" is not a Random.Armstrong Number");
    }
}
