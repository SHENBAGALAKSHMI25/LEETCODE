class Solution {
    public String reverseOnlyLetters(String s) {
        char[]u=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left< right ){
        if(!Character.isLetter(u[left])){
            left++;
        }
        else if(!Character.isLetter(u[right])){
            right--;
        }
        else{
         char temp=u[left];
         u[left]=u[right];
         u[right]=temp;
        //  temp='';
         left++;
         right--;
        }

        }
        String sr= new String(u);
        return sr;
    }
}