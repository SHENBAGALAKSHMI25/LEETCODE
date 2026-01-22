class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        char[] h=s.toCharArray();
        for(int i=1;i<h.length;i++){
            sum=sum+Math.abs((int)h[i-1]-(int)h[i]);
        }
        return sum;
    }
}