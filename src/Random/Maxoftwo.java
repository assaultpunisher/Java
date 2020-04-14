package Random;
/*
To Find Maximum of 2 Numbers using if else
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Maxoftwo{
    public static void main(String args[]) throws IOException {
        //taking value as command line argument.
        //Converting String format to Integer value
        BufferedReader keyboard = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Enter First Number:");
        int i= Integer.parseInt (keyboard.readLine());
        System.out.println("Enter Second Number:");
        int j= Integer.parseInt (keyboard.readLine());
        if(i > j)
            System.out.println(i+" is greater than "+j);
        else
            System.out.println(j+" is greater than "+i);
    }
}