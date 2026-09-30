class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int l = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int r = 0; r < s.length(); r++) {
            int index = s.charAt(r) - 'A';

            count[index]++;
            maxFreq = Math.max(maxFreq, count[index]);

            while ((r - l + 1) - maxFreq > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}