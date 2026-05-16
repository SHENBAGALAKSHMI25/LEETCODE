class Solution {
    public int countBinarySubstrings(String s) {
        ArrayList<Integer>arr=new ArrayList<>();
        int substr=0;
        int count=1;
      int i=1;
     
           while(i<s.length()){
         if(s.charAt(i)==s.charAt(i-1)){
                    count++;
                }
                else{
                    arr.add(count);
                    count=1;
                }
                i++;
               
           }
            arr.add(count);
            for(int v=0;v<arr.size()-1;v++){
               int u=Math.min(arr.get(v),arr.get(v+1));
               substr=substr+u;
                }
                 
        return substr;
    }
}