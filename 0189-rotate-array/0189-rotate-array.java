class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
         k=k%n;
        reverse(nums,0,n-1);
reverse(nums,0,k-1);
reverse(nums,k,n-1);
    }
        private  void reverse(int arr[],int i,int j){
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }   
}
}
// int n=nums.length;
// k=k%n;
// int temp[]=new int[k];
// for(int i=0;i<k;i++){
//     temp[i]=nums[n-k+i];
// }
// for(int i=n-k-1;i>=0;i--){
// nums[i+k]=nums[i];
// }
// for(int i=0;i<k;i++){
//     nums[i]=temp[i];
// }
//  System.out.print(Arrays.toString(nums));
//     }
// }