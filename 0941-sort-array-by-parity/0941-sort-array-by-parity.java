class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        int arr[]=new int[nums.length];
        while(left <nums.length || right >0){
        for(int y:nums){
            if(y%2==0){
             arr[left]=y;
             left++;
            }
            else{
                arr[right]=y;
                right--;
            }
        }
        break;
    }
    return arr;
}
}