package Random;
/*
Display Triangle as follow
        0
        1 0
        1 0 1
        0 1 0 1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Output2{
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader (new
                InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int n = Integer.parseInt(keyboard.readLine());
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(((i+j)%2)+" ");
            }
            System.out.print("\n");
        }
    }
}