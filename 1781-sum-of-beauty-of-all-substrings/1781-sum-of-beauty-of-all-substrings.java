class Solution {
    public int beautySum(String s) {
        int beauty=0;
        for(int i=0;i<s.length();i++){
            int[]ou=new int[26];
            for(int j=i;j<s.length();j++){
            char h=s.charAt(j); 
            ou[h-'a']++;
            int max=1;
            int min=Integer.MAX_VALUE;
            for(int k=0;k<26;k++){
                if (ou[k] > 0) {
                        max = Math.max(max, ou[k]);
                        min = Math.min(min, ou[k]);
                    }
                }
                beauty+=(max-min);
            
            }
        }
return beauty;
    }
}