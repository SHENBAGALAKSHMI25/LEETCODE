class Solution {
    public int countEven(int num) {
       int count=0;
       for(int i=1;i<=num;i++){
        if(i<=9 && i%2==0){
            count++;
        }
        else if(i>9){
            int rev=0;
            int temp=i;
            while(temp>0){
                int d=temp%10;
                rev=rev+d;
                temp=temp/10;
            }
            if(rev%2==0){
                count++;
            }

        }
       }
        return count;
       } 
    }
