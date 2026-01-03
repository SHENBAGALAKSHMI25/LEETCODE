class Solution {
    public String longestPalindrome(String s) {
     StringBuilder v=new StringBuilder();
     for(int i=0;i<s.length();i++){
        String odd=expandcenter(s,i,i);
            if(odd.length()>v.length()){
                v=new StringBuilder(odd);
            }
        
        String even=expandcenter(s,i,i+1);
            if(even.length()>v.length()){
                v=new StringBuilder(even);
            
        }
     }
     return v.toString();
    }

        private String expandcenter(String s,int left,int right){
            while(left>=0 && right <s.length() &&s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            return s.substring(left+1,right);
        }
     }