class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int produ=1;
            for(int j=i;j<nums.length;j++){
                produ=produ*nums[j];
                max=Math.max(produ,max);
            }
            
        }
        return max;
    }
}