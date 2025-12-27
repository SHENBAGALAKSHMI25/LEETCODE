class Solution {
    public String frequencySort(String s) {
        StringBuilder u=new StringBuilder();
      Map<Character, Integer> map = new TreeMap<>(Collections.reverseOrder()); 
      for(char h:s.toCharArray()){
        if(map.containsKey(h)){
            map.put(h,map.get(h)+1);
        }
        else{
            map.put(h,1);
        }
      } 
      List<Map.Entry<Character,Integer>>list=new ArrayList<>(map.entrySet());
      list.sort((a,b)->b.getValue()-a.getValue());
for(Map.Entry<Character,Integer>entry:list){
    int count=entry.getValue();
   while(count>0){
    u.append(entry.getKey());
    count--;
   }
}
return u.toString();
    }
}