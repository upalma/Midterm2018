package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int factorialCount = 5;
        int[] feb = new int[factorialCount];
        feb[0] = 0;
        feb[1] = 1;
        for (int i = 2; i < factorialCount; i++) {
            feb[i] = feb[i - 1] + feb[i - 2];
        }

        for (int i = 0; i < factorialCount; i++) {
            System.out.print(feb[i] + " ");
        }
    }
}