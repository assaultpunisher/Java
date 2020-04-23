package Old.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Write a program to Display Invert Triangle using while loop.
Example:
    Input - 5
    Output :
     5 5 5 5 5
     4 4 4 4
     3 3 3
     2 2
     1
*/
class InvertTriangle{
    public static void main(String args[]) throws IOException {
        BufferedReader keyboard = new BufferedReader (new
                InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int num = Integer.parseInt(keyboard.readLine());
        while(num > 0){
            for(int j=1;j<=num;j++){
                System.out.print(" "+num+" ");
            }
            System.out.print("\n");
            num--;
        }
    }
}