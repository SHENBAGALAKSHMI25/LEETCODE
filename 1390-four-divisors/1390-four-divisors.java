class Solution {
    public int sumFourDivisors(int[] nums) {
        int divisor=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int count=0;
            for(int j=1;j*j<=nums[i];j++){
            if(nums[i]%j==0){
                count++;
                sum=sum+j;
            
            if(j!=nums[i]/j){
                count++;
                sum=sum+(nums[i]/j);
            }
            }
            }
            if(count==4){
                divisor=divisor+sum;
            }
        }
        return divisor;
    }
}