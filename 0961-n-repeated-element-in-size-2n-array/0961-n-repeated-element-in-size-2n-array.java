class Solution {
    public int repeatedNTimes(int[] nums) {
        int v=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int u:nums){
            if(map.containsKey(u)){
                map.put(u,map.get(u)+1);
            }
            else{
                map.put(u,1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int lo=entry.getValue();
            if(lo>1){
                v=v+entry.getKey();
                break;
            }
        }
        return v;
    }
}