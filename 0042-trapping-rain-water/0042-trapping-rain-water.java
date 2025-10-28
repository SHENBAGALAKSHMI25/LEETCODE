class Solution {
    public int trap(int[] arr) {
       int l=0;
   int r=arr.length-1;
   int leftmax=0;
   int rightmax=0;
   int total=0;
   while(l<r){
       if(arr[l]<=arr[r]){
           if(arr[l]>=leftmax){
               leftmax=arr[l];
               }
               else{
                   total=total+leftmax-arr[l];
                  
               }
                l++;
       }
       else{
           if(arr[r]>rightmax){
               rightmax=arr[r];
           }
           else{
            total=total+rightmax-arr[r];
           }
             r--;
       }
   }
      return total;  
    }
} 
   