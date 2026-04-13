class Solution {
    public boolean isPalindrome(int x) {
        int v=x;
        int r=0;
       if(x<10 && x <0){
        return  false;
       }
       else{
        
        while(x!=0){
            int d=x%10;
            r=r*10+d;
            x=x/10;
        }
       }
       if(v==r){
        return true;
       }
       return false;
    }
}
