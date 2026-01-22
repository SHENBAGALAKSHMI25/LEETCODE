class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){//bec if it not -1 then automatiaccly indexes add to the fucntion
                arr.add(i);
              
            }
        }
    
    return arr;
    }
}