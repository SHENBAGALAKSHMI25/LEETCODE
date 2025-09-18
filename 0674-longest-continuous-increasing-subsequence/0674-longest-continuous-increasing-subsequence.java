class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1;
        int maxlr=1;
        int left=0,right=1;
        while(left <nums.length && right <nums.length){
            if(nums[left]>=nums[right]){
             maxlr=Math.max(maxlr,count);
             count=1; 
            }
            else{
                count++;
            }
            left++;
            right++;
        }
        return Math.max(maxlr,count);
    }
}