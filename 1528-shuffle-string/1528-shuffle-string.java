class Solution {
    public String restoreString(String s, int[] indices) {
    char[]u=new char[s.length()];
    for(int i=0;i<indices.length;i++){
        u[indices[i]]=s.charAt(i);
    }
    String result=new String(u);
    return result;
    }
}