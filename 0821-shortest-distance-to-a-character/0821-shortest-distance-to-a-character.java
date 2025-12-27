class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] di = new int[n];
        int prev = -10000; 
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) prev = i;
            di[i] = i - prev;
        }
        prev = 10000; 
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) prev = i;
            di[i] = Math.min(di[i], prev - i);
        }
        return di;
    }
}