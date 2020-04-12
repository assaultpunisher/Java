
/*
Write a program to concatenate string using for Loop
Example:
    Input - 5
    Output - 1 2 3 4 5
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Join{
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader (new
                InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int num = Integer.parseInt(keyboard.readLine());
        String result = " ";
        for(int i=1;i<=num;i++){
            result = result + i + " ";
        }
        System.out.println(result);
    }
}
