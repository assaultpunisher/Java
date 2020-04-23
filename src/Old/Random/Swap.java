package Old.Random;/*
 Write a program to Old.Random.Random.Swap the values
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Swap{
    public static void main(String args[]) throws IOException {
        BufferedReader keyboard = new BufferedReader (new
                InputStreamReader(System.in));
        System.out.println("Enter Number 1 :");
        int num1 = Integer.parseInt(keyboard.readLine());
        System.out.println("Enter Number 2 :");
        int num2 = Integer.parseInt(keyboard.readLine());
        System.out.println("\n***Before Swapping***");
        System.out.println("Number 1 : "+num1);
        System.out.println("Number 2 : "+num2);
//Old.Random.Random.Swap logic
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("\n***After Swapping***");
        System.out.println("Number 1 : "+num1);
        System.out.println("Number 2 : "+num2);
    }
}
