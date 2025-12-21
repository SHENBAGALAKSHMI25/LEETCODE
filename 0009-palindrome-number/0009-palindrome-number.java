class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int original=x;
        int v=0;
       while(x!=0){
        int y=x%10;
        v=v*10+y;
        x=x/10;
        
       } 
       return original==v;
    }
}