class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>arr=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int y=entry.getValue();
            if(y>n/3){
                arr.add(entry.getKey());
            }
        }
        return arr;
    }
}