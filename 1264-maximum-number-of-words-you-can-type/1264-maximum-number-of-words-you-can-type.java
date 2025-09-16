class Solution {
    public int canBeTypedWords(String text, String brokenletters) {
       String []y=text.split("[\\s,!?.]+");
       int count=0;
       char t[]=brokenletters.toCharArray();
      
       for(String h:y){
         boolean present=true;
        for(char u:t){
        if(h.contains(String.valueOf(u))){
            present=false;
            break;
        }
         
       }
    //    count++;
       if(present){
       count++;
    }
       
    }
    return count; 
}

}