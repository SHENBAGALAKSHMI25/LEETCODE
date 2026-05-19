class Solution {
    public List<String> fizzBuzz(int n) {
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=i+1;
      }
      ArrayList<String>li=new ArrayList<>();
      for(int i=0;i<n;i++){
        if(arr[i]%3==0 && arr[i]%5==0){
            li.add("FizzBuzz");
        }
        else if(arr[i]%3==0){
            li.add("Fizz");
        }
        else if(arr[i]%5==0){
            li.add("Buzz");
        }
        else{
            li.add(Integer.toString(i+1));
        }
      }
      return li;  
    }
}