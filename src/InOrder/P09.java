package InOrder;
/*
Write a program for command line argument.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

class CommandLineArgument
        {
public static void main (String[] arr)
        {
        try
        {
            BufferedReader keyboard = new BufferedReader (new
                    InputStreamReader(System.in));
            System.out.println("Enter First Number :");
            int a = Integer.parseInt(keyboard.readLine());
            System.out.println("Enter Second Number :");
            int b = Integer.parseInt(keyboard.readLine());
            int sum=a+b;
            System.out.println("Result is : " +sum);
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        }
        }
