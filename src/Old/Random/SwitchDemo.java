package Old.Random;
/*
Write a program to display a greet message
according to Marks obtained by student.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SwitchDemo{
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader (new
                InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int marks = Integer.parseInt(keyboard.readLine()); //take marks as command line argument.
        switch(marks/10){
            case 10:
            case 9:
            case 8:
                System.out.println("Excellent");
                break;
            case 7:
                System.out.println("Very Good");
                break;
            case 6:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Work Hard");
                break;
            case 4:
                System.out.println("Poor");
                break;
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Very Poor");
                break;
            default:
                System.out.println("Invalid value Entered");
        }
    }
}
