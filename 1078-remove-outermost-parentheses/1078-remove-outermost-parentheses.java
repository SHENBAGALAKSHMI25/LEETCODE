class Solution {
    public String removeOuterParentheses(String s) {
     StringBuilder ans=new StringBuilder();
     int count=0;
     for(char y:s.toCharArray()){
        if(y=='('){
            count++;
        if(count>1) ans.append(y);
        }
        else if(y==')'){
            if(count>1) ans.append(y);
         count--;
        }
     }
     return ans.toString();
    }
}