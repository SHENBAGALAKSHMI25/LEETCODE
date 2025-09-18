class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         Arrays.sort(nums);
        ArrayList<Integer>arr=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
       for(int y:nums){
            set.add(y);
        }
        for(int i=0;i<nums.length;i++){
        
            if(!set.contains(i+1)){
                  arr.add(i+1);
            }
           
 
        }
        return arr;
    }
}