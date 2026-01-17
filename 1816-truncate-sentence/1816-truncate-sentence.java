class Solution {
    public String truncateSentence(String s, int k) {
    StringBuilder d=new StringBuilder();
    String[]array=s.split(" ");
    for(int i=0;i<k;i++){
        if(i==k-1){
        d.append(array[i]);
    }
    else{
        d.append(array[i]+" ");
    }
    }
return d.toString();

    }
}