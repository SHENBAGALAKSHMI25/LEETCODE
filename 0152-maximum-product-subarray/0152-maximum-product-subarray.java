class Solution {
    public int maxProduct(int[] nums) {
        int maxi=1;
        for(int i=0;i<nums.length;i++){
            int mul=1;
            for(int j=i;j<nums.length;i++){
                mul=mul*nums[j];
                maxi=Math.max(maxi,mul);
            }
            
        }
        return maxi;
    }
}