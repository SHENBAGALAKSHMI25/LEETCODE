class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];  // add current num digit to k
                i--;
            }
            res.add(k % 10);  // add last digit
            k /= 10;          // remaining carry
        }

        Collections.reverse(res);
        return res;
    }
}
