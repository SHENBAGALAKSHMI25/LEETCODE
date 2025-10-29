class Solution {
    public int search(int[] nums, int target) {
      int y=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==target){
                y=y+i;
                return y;
            }
        }
        return -1;
    }
}