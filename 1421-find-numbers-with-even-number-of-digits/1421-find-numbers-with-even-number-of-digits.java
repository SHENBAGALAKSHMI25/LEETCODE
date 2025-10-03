class Solution {
    public int findNumbers(int[] nums) {
     int count=0;
     int each=0;
     for(int n:nums){
     while(n>0){
        int d=n%10;
        each++;
        n=n/10;
     }
     if(each%2==0){
        count++;
     } 
     each=0;  
    }
    return count;
}
}