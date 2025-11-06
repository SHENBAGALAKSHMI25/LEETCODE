class Solution {
    public String modifyString(String s) {
        char[]y=s.toCharArray();
        for(int i=0;i<y.length;i++){
            if(y[i]=='?'){
                y[i]='a';
                if(i!=0){
                if(y[i-1]==y[i]){
                    y[i]++;
                }
                }
                if(i!=y.length-1){
                    if(y[i+1]==y[i]){
                        y[i]++;
                        if(i!=0){
                            if(y[i-1]==y[i]){
                                y[i]++;
                            }
                        }
                    }

                }
            }
        }
        return new String(y);
    }
}