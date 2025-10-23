class Solution {
    public String sortString(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        StringBuilder u=new StringBuilder();
        for(char uv:s.toCharArray()){
            if(map.containsKey(uv)){
                map.put(uv,map.get(uv)+1);
            }
            else{
                map.put(uv,1);
            }
        }
        while(!map.isEmpty()){
        for(char i='a';i<='z';i++){
            if(map.containsKey(i)){
                map.put(i,map.get(i)-1);
                if (map.get(i) == 0) map.remove(i);
                u.append(i);
            }
        }
        for(char j='z';j>='a';j--){
            if(map.containsKey(j)){
                map.put(j,map.get(j)-1);
                if (map.get(j) == 0) map.remove(j);
                u.append(j);
            }
        }
    }
    return u.toString();
    }
}