class Solution {
    public boolean checkIfPangram(String sentence) {
       char []freq=new char[26];
       boolean flag=true;
       for(char y:sentence.toCharArray()){
        freq[y-'a']++;
       }
       for(int i=0;i<26;i++){
        if(freq[i]==0){
        flag=false;
        
       }
       }
       return flag;
    }
}