class Solution {
    public String largestOddNumber(String num) {
        String i="";
        int u=num.length()-1;
        char y=num.charAt(u);
        if((y-'0')%2!=0) {
            i=num;
        }
        else{
        for(int h=num.length()-1;h>=0;h--){
            char ra=num.charAt(h);
            if((ra-'0')%2!=0){
            i = num.substring(0,h+1);
            break;
        }
        }
        }
        return i;
    }
}