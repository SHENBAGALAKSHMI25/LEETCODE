class Solution {
    public int getLucky(String s, int k) {
        char[]v=s.toCharArray();
        StringBuilder u=new StringBuilder();
        for(char y:v){
            u.append(y-'a'+1);
        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum=0;
            for(char c:u.toString().toCharArray()){
                sum=sum+c-'0';
            }
            u=new StringBuilder(Integer.toString(sum));
        }
        return sum;
    }
}