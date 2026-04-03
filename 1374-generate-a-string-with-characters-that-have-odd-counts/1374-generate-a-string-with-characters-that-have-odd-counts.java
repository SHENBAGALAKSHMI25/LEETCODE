class Solution {
    public String generateTheString(int n) {
        String y="";
        if(n%2!=0){ 
            int count=0;
            while(count!=n){
              y=y+'a';
              count++;
            }
           
        }
        else{
            int count=0;
            while(count!=n-1){
              y=y+'a';
              count++;
            }
            y=y+'b';
        }
        
     return y;
}
}