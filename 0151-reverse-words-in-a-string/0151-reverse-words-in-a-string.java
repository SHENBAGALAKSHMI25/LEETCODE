class Solution {
    public String reverseWords(String s) {
        StringBuilder h=new StringBuilder();
        String []array=s.trim().split("\\s+");
        for(int i=array.length-1;i>=0;i--){
            h.append(array[i]);
            if(i!=0){
            h.append(" ");
        }

        }
       return  h.toString();
    }
}