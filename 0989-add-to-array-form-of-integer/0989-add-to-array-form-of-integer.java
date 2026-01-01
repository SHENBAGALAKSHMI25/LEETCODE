class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        ArrayList<Integer> arr = new ArrayList<>();

        // reverse num array
        int left = 0, right = num.length - 1;
        while (left < right) {
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;
        }

        int i = 0;

        // process while k > 0 OR digits of num remain
        while (k > 0 || i < num.length) {
            int digit = k % 10;

            if (i < num.length) {
                arr.add(num[i] + digit);
            } else {
                arr.add(digit);
            }

            int carry = arr.get(i) / 10;
            arr.set(i, arr.get(i) % 10);   // ✅ FIXED

            k = k / 10;
            k += carry;

            i++;
        }

        Collections.reverse(arr);
        return arr;
    }
}
