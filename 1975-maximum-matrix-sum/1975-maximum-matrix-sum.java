class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int count=0;
        long minAbs=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int val=matrix[i][j];
              if(val<0)count++;
              long h=Math.abs(val);
              sum+=h;
              minAbs = Math.min(minAbs,h);
        }
    }
     if(count%2!=0){
        sum-=2*minAbs;
     }   
    

return sum;
    }
}