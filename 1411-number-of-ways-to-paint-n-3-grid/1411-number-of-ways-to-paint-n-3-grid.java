class Solution {
    public int numOfWays(int n) {
     long mod=1_000_000_007;
     long ways3=6l;
     long ways2=6l;
     for(int i=2;i<=n;i++){
        long ways3colour=(3*ways3 + 2*ways2)%mod;
        long ways2colour=(2*ways3+ 2*ways2)%mod;
        ways3=ways3colour;
        ways2=ways2colour;
     }
   return (int)((ways3 + ways2)%mod);
    }
}
