package ExampleProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram {

    public static void findAnagrams(String[] arr)
    {
        //Create a hash map for comparison
        HashMap<String, List<String>> map = new HashMap<>();

        /* Steps to find anagram
            1. Convert all words into lists of chars
            2. Sort all the lists of chars to make new words
            3. Create a hash map that contains a word (Key) and a list of anagrams (Value)
         */
        for (String word : arr) {

            // convert to char array
            char[] letters = word.toCharArray();

            //Sort the letters of the string
            Arrays.sort(letters);

            //Convert the letters back to a string
            String sortedWord = new String(letters);

            // calculate hashcode of string after sorting
            if (map.containsKey(sortedWord)) {
                // Value Hash map value to include any matching words.
                map.get(sortedWord).add(word);
            } else {
                // Add word to map if it does not exist
                // Map is key: sorted word, value: list of anagrams
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(sortedWord, words);
            }
        }

        // print all the values where size is > 1

        //Print using streams
        map.keySet().forEach(s -> { List<String> values = map.get(s);
                                     if(values.size() > 1) System.out.println(values);});

        // Print using a enhanced  for loop
        for (String s : map.keySet()) {
            List<String> values = map.get(s);
            if (values.size() > 1) {
                System.out.println(values);
            }
        }
    }


}
