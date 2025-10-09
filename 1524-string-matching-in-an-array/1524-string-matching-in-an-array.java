class Solution {
    public List<String> stringMatching(String[] words) {
       HashSet<String>set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].indexOf(words[j])!=-1){
                    set.add(words[j]);
                }
                else if(words[j].indexOf(words[i])!=-1){
                    set.add(words[i]);

                }
            }
        }
        return new ArrayList<>(set);
    }
}