package hbcu.stay.ready.algor;

public class Solution {

    public String countUniqueWords(String input){
        String [] sentence = input.split(" ");
        int count = 0;
        for(int x = 0; x<sentence.length; x++){
            for(int i = 0; i<sentence.length; i++){
                if(sentence[x].equals(sentence[i])){
                    count +=1;
                    sentence[x] = "0";
                }
                if(sentence[x]!="0"){
                    System.out.println(count);
                }

            }
        }
        return null;
    }
}
