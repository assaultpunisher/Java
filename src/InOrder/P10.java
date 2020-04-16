package InOrder;
/*
Write a program for Handling an Exception In java.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ExceptionHandling
        {
public static void main(String arr[])
        {
        try
        {
            BufferedReader keyboard = new BufferedReader (new
                    InputStreamReader(System.in));
            System.out.println("Enter First Number :");
            int a = Integer.parseInt(keyboard.readLine());
            System.out.println("Enter Second Number :");
            int b = Integer.parseInt(keyboard.readLine());
        int div = a/b;
        System.out.println("Result : "+ div);
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        }
        }