/*
Program to Display Multiplication Table
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MultiplicationTable{
    public static void main(String args[]) throws IOException {
        BufferedReader keyboard = new BufferedReader (new
                InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int num = Integer.parseInt(keyboard.readLine());
        System.out.println("*****MULTIPLICATION TABLE*****");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(" "+i*j+" ");
            }
            System.out.print("\n");
        }
    }
}
