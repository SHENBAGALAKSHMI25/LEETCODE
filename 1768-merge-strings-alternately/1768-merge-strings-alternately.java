class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder h=new StringBuilder();
        int i=0;
        while(i<word2.length() && i<word1.length()){
           h.append(word1.charAt(i));
        h.append(word2.charAt(i));
        i++;
       }
       while(i<word2.length()){
        h.append(word2.charAt(i++));
       }
       while(i<word1.length()){
        h.append(word1.charAt(i++));
       }
        
       return h.toString();
        }
} 
