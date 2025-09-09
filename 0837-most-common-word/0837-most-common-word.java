class Solution {
    public String mostCommonWord(String input, String[] banned) {
        String h[]=input.toLowerCase().split("[\\s,.;?!':]+");
       HashMap<String,Integer>map=new HashMap<>();
       for(String c:h){
        if(!map.containsKey(c)){
            map.put(c,1);
        }
        else{
            map.put(c,map.get(c)+1);
        }
       }
       String mostCommon="";
       int maxCount=0;
       for(Map.Entry<String,Integer>entry:map.entrySet()){
      String word = entry.getKey();
       boolean isBanned = false;
    for (String b : banned) {
        if (word.equals(b)) {
            isBanned = true;
            break;
        }
    }
    if (!isBanned && entry.getValue() > maxCount) {
        maxCount = entry.getValue();
        mostCommon = word;
    }
}
return mostCommon;
    }
}