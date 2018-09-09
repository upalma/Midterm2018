package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    String word1 = "MARY";
    String word2 = "ARMY";
    int letters1[] = new int [Character.MAX_VALUE];
    int letters2[] = new int [Character.MAX_VALUE];

    if(word1.length()!= word2.length())
        System.out.println("Not an Aragram");
else{
    for(int i = 0; i< word1.length(); ++i){
    letters1[word1.toLowerCase().charAt(i)]++;
    letters2[word2.toLowerCase().charAt(i)]++;
        }
        boolean anagram = true;
    for (int i = 0; i<letters1.length && anagram; ++i){
        if(letters1[i] != letters2 [i]){
            anagram = false;
        }
    }
   if(anagram)  {
       System.out.println("Anagram");
   }else {
       System.out.println("Not an Anagram");
   }
    }
    }
}
