class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
       
         int n=1;
         if(nums.length==0) return 0;
        //   if(nums.length<=1) return n;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1] +1 ){
                n++;
max=Math.max(n,max);
            }
            else if(nums[i]!=nums[i-1]){
                n=1;
            }
            
        }
        return max;
    }
}