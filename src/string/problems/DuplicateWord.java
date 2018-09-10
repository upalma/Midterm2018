package string.problems;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        public static Set<String> duplicateWords(String input){
            if(input == null || input.isEmpty()){
                return Collections.emptySet(); }
            Set<String> duplicates = new HashSet<>();
            String[] words = input.split("\\s+");
            Set<String> set = new HashSet<>();
            for(String word : words){
                if(!set.add(word)){
                    duplicates.add(word); } }
            return duplicates;
        }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String test = "Java is a programming Language, Java is  computer  a Language. Java is  widely used Language";
        Set<String> duplicates = duplicateWords(test);
        System.out.println("input : " + test);
        System.out.println("output : " + duplicates); }

}

