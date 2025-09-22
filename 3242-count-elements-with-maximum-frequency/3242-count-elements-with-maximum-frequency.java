class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int  i:nums){
        if(map.containsKey(i)){
            map.put(i,map.get(i)+1);
        }
        else{
            map.put(i,1);
        }
       }
       int maxfreq=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            maxfreq = Math.max(maxfreq, entry.getValue());
        }
        int count=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==maxfreq){
                count+=entry.getValue();
            }
        }
        
       return count;
    }

}