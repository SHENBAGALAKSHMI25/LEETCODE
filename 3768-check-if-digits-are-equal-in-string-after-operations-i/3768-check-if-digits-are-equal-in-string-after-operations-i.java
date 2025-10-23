class Solution {
    public boolean hasSameDigits(String s) {
        // int []p=new int[s.length()];
        boolean can=false;
        // String []y=s.split(" ");
        // for(int i=0;i<s.length;i++){
        //     p[i]=Integer.parseInt(y[i]);
        // }
        // StringBuilder n=new StringBuilder();
        // while(n.length>2){

        // for(int i=1;i<p.length-1;i++){
        //     int val=(p[i]+p[i-1])%10;
        //     n.append(val);
        // }
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()>2){
            StringBuilder next=new StringBuilder();
            for(int i=1;i<sb.length();i++){
                int val=(sb.charAt(i)-'0'+sb.charAt(i-1)-'0')%10;
                next.append(val);

            }
            sb=next;
        }
        for(int i=1;i<sb.length();i++){
        if(sb.charAt(i-1)-'0'==sb.charAt(i)-'0'){
            can=true;
        }
    }
        return can;
    }
}