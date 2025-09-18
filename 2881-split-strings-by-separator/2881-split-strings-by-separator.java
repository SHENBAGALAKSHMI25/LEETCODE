import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String>arr=new ArrayList<>();
         String sep = Pattern.quote(String.valueOf(separator));
        for(String s:words){
        String h[]=s.split(sep);
        for(String i:h){
            if(!i.isEmpty())
            arr.add(i);
        }
        }
        return arr;
    }
}