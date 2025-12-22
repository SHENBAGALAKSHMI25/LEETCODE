class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean godt=true;
        StringBuilder h=new StringBuilder();
        StringBuilder f=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            h.append(word1[i]);
        }
        for(int j=0;j<word2.length;j++){
            f.append(word2[j]);
        }
      if(!h.toString().equals(f.toString())){
            godt=false;
        }
        return godt;
    }
}