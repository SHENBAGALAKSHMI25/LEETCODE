class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String n:strs){
            char[]u=n.toCharArray();
            Arrays.sort(u);
            String sorted=new String(u);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            
                map.get(sorted).add(n);
            }

        
        return new ArrayList<>(map.values());
    }
}