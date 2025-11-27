class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isincrease=false;
        boolean isdecrease=false;
        int i=0;
        int j=1;
        while(i<=j &&j<nums.length){
            if(nums[i]<nums[j]){
               isincrease=true;
            }
    
            else if(nums[i]>nums[j]){
                isdecrease=true;
            }
            
        
            if(isincrease && isdecrease){
                
return false;
            }
            i++;
            j++;
        }
           return true;
            
        }
    
}