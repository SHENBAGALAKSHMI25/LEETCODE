class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int arr[]=new int[2];
        int sum=0;
        int count=1;
        for(int i=0;i<s.length();i++){
            int w=widths[s.charAt(i)-'a'];
            if(sum+w>100){
              count++;
              sum=w;
            }
            else{
                sum=sum+w;
            }
        }
        arr[0]=count;
        arr[1]=sum;
        return arr;
    }
}