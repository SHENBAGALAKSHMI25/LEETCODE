class Solution {
    public int minimumCost(int[] arr) {
      Arrays.sort(arr);  
      int sum=0;
      int n=arr.length;
      for(int i=n-1;i>=0;i-=3){
       sum=sum+arr[i];
       if(i-1>=0) sum=sum+arr[i-1];
      }
     
      return sum;
    }
}