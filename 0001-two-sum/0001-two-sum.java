class Solution {
    public int[] twoSum(int[] nums, int target) {
    //optimal
    HashMap<Integer,Integer>map=new HashMap<>();
    int arr[]=new int[2];
    for(int i=0;i<nums.length;i++){
        int a=target-nums[i];//9-2=7 //9-7
        if(!map.containsKey(a)){//2
           map.put(nums[i],i);//2,0
        }
        else{
            arr[0]=map.get(a);
            arr[1]=i;
        }
    }
    return arr;
    }
}