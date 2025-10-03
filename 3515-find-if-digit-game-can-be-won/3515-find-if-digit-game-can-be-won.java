class Solution {
    public boolean canAliceWin(int[] nums) {
        boolean win=false;
        int sumsin=0;
        int sumdou=0;
        for(int i:nums){
            if(i<=9){
                sumsin=sumsin+i;
             }
             else{
                sumdou=sumdou+i;
             }
        }
        if(sumsin>sumdou || sumsin<sumdou ){
            win=true;
            
        }
        // else if( sumsin==sumdou){
        //     win;
        // }
        return win;
    }
}