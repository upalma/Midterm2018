package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String st = "ABCD";
        int i = st.length();
        Permutation permutation = new Permutation();
        permutation.permute(st, 0, i-1);
    }

    private void permute(String string, int j, int k)
    {
        if (j == k)
            System.out.println(string);
        else
        {
            for (int i = j; i <= k; i++)
            {
                string = swap(string,j,i);
                permute(string, j+1, k);
                string = swap(string,j,i);
            }
        }
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}



