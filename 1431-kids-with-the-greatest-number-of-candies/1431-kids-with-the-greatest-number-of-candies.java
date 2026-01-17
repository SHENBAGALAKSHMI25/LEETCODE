class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>list=new ArrayList<>();
      for(int i=0;i<candies.length;i++){
        boolean u=true;
        int a=candies[i]+extraCandies;
        for(int j=0;j<candies.length;j++){
            if(!(a>=candies[j])){
               u=false;
               break;
            }
        }
list.add(u);
      }
      return list;
        }
    
}