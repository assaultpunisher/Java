package InOrder;
/*
Write a program to calculate square for a number using
        swing.
*/

import javax.swing.*;

        class InputOutput
{
    public static void main(String arr[])
    {
        String input= JOptionPane.showInputDialog("Enter a number");
        int number=Integer.parseInt(input);
        int square=number*number;
        System.out.println("square = "+square);
        JOptionPane.showMessageDialog(null,"Square: " +square);
        System.exit(0);
    }
}