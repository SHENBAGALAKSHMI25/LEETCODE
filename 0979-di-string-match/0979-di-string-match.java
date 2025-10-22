class Solution {
    public int[] diStringMatch(String s) {
        int []prem=new int [s.length()+1];
        int d=s.length();
        int i2=0;
        // while(i2<s.length() && d>0){
        for(int i=0;i<s.length();i++){
            char u=s.charAt(i);
            if(u=='I'){
               prem[i]=i2;
               i2++;
            }
            else if(u=='D'){
                prem[i]=d;
                d--;
            }
        }
        prem[s.length()] = i2; 

    
    return prem;
}
}