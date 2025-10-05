class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String>arr=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        String[]arr21=s1.split("[\\s,]+");
        String []arr2=s2.split("[\\s,]+");
        for(String h:arr21){
            if(map.containsKey(h)){
                map.put(h,map.get(h)+1);
        }
        else{
            map.put(h,1);
        }
        }
        for(String y:arr2){
            if(map.containsKey(y)){
                map.put(y,map.get(y)+1);
        }
        else{
            map.put(y,1);
        }
        }
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            
            int value=entry.getValue();
            String o=entry.getKey();
            if(value==1){
                arr.add(o);
            }
        }
        String u[]=arr.toArray(new String[arr.size()]);
        return u;
    }
}