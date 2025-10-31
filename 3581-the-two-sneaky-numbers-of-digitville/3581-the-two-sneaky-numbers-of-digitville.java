class Solution {
    public int[] getSneakyNumbers(int[] nums) {
         Arrays.sort(nums);
         ArrayList<Integer>m=new ArrayList<>();
    HashMap<Integer,Integer>map=new HashMap<>();
    int r[]=new int [2];
    // for(int i=0;i<nums.length;i++){
        for(int y:nums){
            if(map.containsKey(y)){
                map.put(y,map.get(y)+1);
            }
            else{
                map.put(y,1);
            }
        }
    
        int v=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            
            int u=entry.getValue();
            if(u>=2){
                m.add(entry.getKey());
                // if(v==2)break;
            }
        }
        // Collections.sort(m);
   for(int i=0;i<m.size();i++){
    r[i]=m.get(i);
   }
    return r;        

}
}