class Solution {
    public int heightChecker(int[] heights) {
        int []expected=heights.clone();
        Arrays.sort(expected);
        int i=0;
        int count=0;
        while(i<heights.length){
           if(heights[i]!=expected[i]){
            count++;
           }
           i++;
        }
        return count;
    }
}