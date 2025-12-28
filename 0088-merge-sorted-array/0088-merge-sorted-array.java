class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        int u=0;
        for(int i=0;i<m;i++){
            if(nums1[i]!=0){
            arr[u++]=nums1[i];
        }
        }
         for(int j=0;j<n;j++){
            arr[u++]=nums2[j];
        }
        for(int i = 0; i < m + n; i++) {
    nums1[i] = arr[i];
}

        Arrays.sort(nums1);
        System.out.print(Arrays.toString(nums1));
    }
}