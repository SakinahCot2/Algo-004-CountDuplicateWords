package hbcu.stay.ready.algor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {

    public String countUniqueWords(String input){
        String [] sentence = input.split("\\.|\\!|\\s");
        int count = 0;

        Map<String, Integer> words = new HashMap<String, Integer>();
        for(int x = 0; x<sentence.length; x++){
            count = 0;
            for(int j = 0; j<sentence.length; j++){
                if(sentence[x].equals(sentence[j])){
                    count++;
                }
            }
            words.put(sentence[x],count);
        }


        /*
        for(int x = 0; x<sentence.length; x++){
            count = 1;

        }
        for(int i = 1; i<sentence.length; i++){
            if(sentence[x])
        }

         */

        return String.valueOf(words);
    }
}
