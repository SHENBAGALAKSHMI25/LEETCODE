class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        // if(s.length()<=2 && ) return 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    int y=j-i-1;
                    if(y>max)
                    // 
                    max=y;
                }
                // else if(s.length()<=2){

                }
            }
            if(max==-1){
                return -1;
            }
return max;
        }
        
    
}