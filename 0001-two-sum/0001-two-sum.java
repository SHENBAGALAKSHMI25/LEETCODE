class Solution {
    public int[] twoSum(int[] nums, int target) {
    //brute force
    //frst for loop to acccess each element
    // second use to add with the frst elemt chosen from the frst loop
    // the both index shouldn't same
    //using the if condition add both element frst+secd then compare it with the target if it equals pass it to the array 
    //at final return the array
    int arr[]=new int[2];
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
            if(i==j)continue;//it starts to continue next condition 
            if(nums[i]+nums[j]==target){
                arr[0]=i;
                arr[1]=j;
            }
        }
    }
    return arr;
    }
}