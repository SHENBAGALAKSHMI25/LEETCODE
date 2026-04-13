class Solution {
    public int reverse(int x) {
        int ori=x;
    int rev=0;
    while(x!=0){
        if(rev < Integer.MIN_VALUE/10 || rev > Integer.MAX_VALUE/10){
            return 0;
        }
        else{
        int d=x%10;
        rev=rev*10+d;
        x=x/10;
    }
    }
    
    return rev;
    }
}