class Solution {
    public int thirdMax(int[] nums) {
       Arrays.sort(nums);
       int start=nums[nums.length-1];
       int counter=1;
       for(int i=nums.length-2;i>=0;i--){
        if(nums[i]!=nums[i+1]){
            counter++;
            if(counter==3) return nums[i];
        }
        
       }
       return start;
    }
    }