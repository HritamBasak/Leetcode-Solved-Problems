class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        int ones = 0, zeroes = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            // count current character
            if (s.charAt(i) == '1') ones++;
            else zeroes++;

            // shrink window if both counts exceed k
            while (ones > k && zeroes > k) {
                if (s.charAt(left) == '1') ones--;
                else zeroes--;
                left++;
            }

            // count substrings ending at i
            count += i - left + 1;
        }

        return count;
    }
}
