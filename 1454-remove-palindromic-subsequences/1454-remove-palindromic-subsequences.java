class Solution {
    public int removePalindromeSub(String s) {
      int count=1;
      char y[]=s.toCharArray(); 
      int i=0;
      int j=y.length-1;
      while(i<j){
        if(y[i]!=y[j]){
           count=2;
           break;
        }
        i++;
        j--;
      }
      return count;
    }
}