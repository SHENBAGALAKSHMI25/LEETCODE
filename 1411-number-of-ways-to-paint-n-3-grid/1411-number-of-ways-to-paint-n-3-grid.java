class Solution {
    public int numOfWays(int n) {
     long dp[][]=new long[n][2];
     long mod=1_000_000_007;
     dp[0][0]=6 ;//pattern 1 (three different colours "x y z" )
     dp[0][1]=6;//pattern 2(frst and third are same " x y x")
   for(int i=1;i<n;i++){
    dp[i][0]=(dp[i-1][0]*3 + dp[i-1][1]*2)%mod;//[i]rows [0]columns // this row for the pattern 1
    dp[i][1]=(dp[i-1][0]*2 + dp[i-1][1]*2)%mod;// this row for the pattern 2
   }
   return (int)((dp[n-1][0] + dp[n-1][1])%mod);
    }
}
