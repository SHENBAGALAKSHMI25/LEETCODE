class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int lnmax=0;
        int left=0;
        int right=0;
        int max=0;
        while( right <nums.length){
            if(nums[right]==1){
               lnmax++;
               max=Math.max(lnmax,max);
            }
            else{
                lnmax=0;
            }
            
            right++;
        }
        return max;
    }
}