package Random;
/* Fibonacci Series Java Example
This Fibonacci Series Java Example shows how to create and print
Fibonacci Series using Java.
*/

public class JavaFibonacciSeriesExample {

    public static void main(String[] args) {

        //number of elements to generate in a series
        int limit = 20;

        long[] series = new long[limit];

        //create first 2 series elements
        series[0] = 0;
        series[1] = 1;

        //create the Fibonacci series and store it in an array
        for(int i=2; i < limit; i++){
            series[i] = series[i-1] + series[i-2];
        }

        //print the Fibonacci series numbers

        System.out.println("Fibonacci Series upto " + limit);
        for(int i=0; i< limit; i++){
            System.out.print(series[i] + " ");
        }
    }
}
