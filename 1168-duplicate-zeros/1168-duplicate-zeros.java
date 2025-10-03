class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros=0;
        for(int i:arr){
            if(i==0){
                zeros++;
            }
        }
        int n=arr.length;
        for(int o=n-1;o>=0;o--){
            int pos=o+zeros;
            if(pos <n) arr[pos]=arr[o];
            if(arr[o]==0){
                zeros--;
                pos=o+zeros;
                if(pos < n)arr[pos]=0;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}