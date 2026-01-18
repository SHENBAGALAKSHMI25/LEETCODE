class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int max=0;
        HashSet<Character>set=new HashSet<>();
        while(end<s.length()){
              char y=s.charAt(end);
              while(set.contains(y)){
                set.remove(s.charAt(start));
                start++;
              }
              set.add(y);
        
        int window= end-start+1;
        max=Math.max(max,window);
        end++;
        }
        return max;
    }
}
       