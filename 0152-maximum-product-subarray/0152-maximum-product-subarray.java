class Solution {
    public int maxProduct(int[] nums) {
        int maxpr=nums[0];
        int minpr=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
        if(nums[i]<0){
            int temp=maxpr;
            maxpr=minpr;
            minpr=temp;
        }
        maxpr=Math.max(nums[i],nums[i]*maxpr);
        minpr=Math.min(nums[i],nums[i]*minpr);
        result=Math.max(result,maxpr);
        }
        return result;
    }
}