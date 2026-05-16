class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]* nums[i]);
        }
        int arry[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            arry[i]=arr.get(i);
        }
        for(int i=0;i<arry.length-1;i++){
            for(int j=i+1;j<arry.length;j++){
                if(arry[i]>arry[j]){
int temp = arry[i];
arry[i] = arry[j];  
arry[j] = temp;  
            }
        }
       
        }
        return arry;
    }
}