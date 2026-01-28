class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
   HashMap<Integer,Integer>map=new HashMap<>();
   for(int i=0;i<nums.length;i++){
    int n=target-nums[i];
    if(!map.containsKey(n)){
       map.put(nums[i],i);
    }
    else{
        arr[0]=map.get(n);
        arr[1]=i;
    }
   }
   return arr;
    }
}