import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> chr = new ArrayList<>();
        for (char h : s.toCharArray()) {
            if (Character.isLetterOrDigit(h)) {
                chr.add(Character.toLowerCase(h));
            }
        }
        int i = 0;
        int j = chr.size() - 1;
        while (i < j) {
            if (!chr.get(i).equals(chr.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
