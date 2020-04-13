
/*
Display Triangle as follow.
        1
        2 3
        4 5 6
        7 8 9 10 ... N
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Output1{
    public static void main(String args[]) throws IOException {
        int c=0;
        BufferedReader keyboard = new BufferedReader (new
                InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int n = Integer.parseInt(keyboard.readLine());
        loop1: for(int i=1;i<=n;i++){
            loop2: for(int j=1;j<=i;j++){
                if(c!=n){
                    c++;
                    System.out.print(c+" ");
                }
                else
                    break loop1;
            }
            System.out.print("\n");
        }
    }
}
