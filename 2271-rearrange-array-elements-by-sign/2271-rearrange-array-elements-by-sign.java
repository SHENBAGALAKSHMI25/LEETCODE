class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        int result[]=new int[n];
        int p=0;
            int n2=0;
        for(int i=0;i<n;i++){
            
            if(i%2==0){result[i]=pos.get(p++);
        }
        else{
            result[i]=neg.get(n2++);

        }

        }
        return result;
    }
}
        
      