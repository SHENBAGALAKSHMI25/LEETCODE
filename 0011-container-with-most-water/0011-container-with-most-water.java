class Solution {
    public int maxArea(int[] height) {
        int currentarea=0;
        int maxarea=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            currentarea=(int)(Math.min(height[left],height[right])*(right-left));
            maxarea=Math.max(currentarea,maxarea);
            if(height[left]<=height[right]){
                left++;
        
            }
            else if(height[left]>height[right]){
                right--;
            }
            
        }
        return maxarea;
    }
}
        
    
