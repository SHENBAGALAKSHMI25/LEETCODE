class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        
        // Count frequency of chars
        int[] charCount = new int[26];
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        for (String word : words) {
            int[] wordCount = new int[26];
            boolean valid = true;
            
            for (char c : word.toCharArray()) {
                wordCount[c - 'a']++;
                
                // If word needs more of c than available in chars
                if (wordCount[c - 'a'] > charCount[c - 'a']) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) {
                sum += word.length();
            }
        }
        
        return sum;
    }
}
