class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int arr[]=new int[2];
        int count=1;
        int sum=0;
        int n=nums.length;
        int total=n*(n+1)/2;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
            count=nums[i];
            arr[0]=count;
            break;
        }
    }
         for(int i=0;i<n;i++){
            sum=sum+nums[i];
         }
         int miss=total-(sum-count);
         arr[1]=miss;
         return arr;
    }
}