package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {
    public static void main(String[] args) {

        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */

            int array [] = {10, 2, 9, 4, 5, 3, 1, 8, 6};
            int missingNo = getMissingNo(array, 9);
            System.out.println(missingNo);
        }

        // Function to identifify missing number
        static int getMissingNo ( int m[], int n){
            int i, total;
            total = (n + 1) * (n + 2) / 2;
            for (i = 0; i < n; i++)
                total -= m[i];
            return total;
        }
    }

