package string.problems;

public class Palindrome {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        public static boolean isPalindrome (String string){
            String palindrome = string;
            StringBuilder palindrom = new StringBuilder();

            int wordLength = palindrome.length();

            for (int i = 0; i < wordLength; i++) {
                palindrom.append(palindrome.charAt(wordLength - 1 - i));
            }

            String revPalindrom = new String(palindrom);

            if (palindrome.matches(revPalindrom)) return true;
            else return false;
        }

        public static void main (String[]args){

            if (isPalindrome("MADAM")) System.out.println("Palindrome: ");
            else System.out.println("Not Palindrome: ");
        }
}
