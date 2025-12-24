class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum=sum+apple[i];
        }
        Arrays.sort(capacity);
        
      int[] desc = new int[capacity.length];
        int index = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
                   desc[index++]=capacity[i] ;
                   
                 }
                 int currentsum=0;
                 int box=0;
        for(int u:desc ){
           currentsum+=u;
           box++;
           if(currentsum>=sum)break;
        }
        return box;
    }
    }
        