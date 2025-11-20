class Solution {
    public int[] productExceptSelf(int[] nums) {
        int y[]=new int[nums.length];
        // int u=0;
        int v[]=new int[nums.length];
        int finl[]=new int[nums.length];
        y[0]=1;
        for(int i=1;i<nums.length;i++){
                y[i]=y[i-1]*nums[i-1];
               
            }
    
        v[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
                v[i]=v[i+1]*nums[i+1];
            }
        
        for(int i=0;i<finl.length;i++){
           finl[i]=v[i]*y[i];
           
        }
        return finl;
    }
}