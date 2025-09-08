class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a=1;
        int b=n-a;
        int arr[]=new int[2];
        for(a=1;a<n;a++){
            arr[0]=a;
            arr[1]=n-a;
            if(iszero(arr[0]) && iszero(arr[1])){
                return arr;
            }
        }
        return new int[0];

    }
    private boolean iszero(int num){
        return !Integer.toString(num).contains("0");
    }
}