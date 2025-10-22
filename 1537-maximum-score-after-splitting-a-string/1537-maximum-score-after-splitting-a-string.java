class Solution {
    public int maxScore(String s) {
       char []u=s.toCharArray();
        int rightones=0;
        int maxco=0;
        int n=s.length();
       for(char y:u){
        if(y=='1') rightones++;
       }
      int leftones=0;
     int tones=rightones;
        for(int i=0;i<n-1;i++) {
            if(u[i]=='0') {
                leftones++;
            }
            else{
                tones--;
            }
        
        int score=leftones+tones;
        
        maxco=Math.max(maxco,score);       
            }
            return maxco;
       
    }
}