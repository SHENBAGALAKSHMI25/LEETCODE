class Solution {
    public int smallestNumber(int n) {
        int sum=1;
       while(n >sum){
        sum = (sum << 1)| 1; 
       }
       return sum;
    }
}