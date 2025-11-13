import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        // map: character -> last seen index
        Map<Character, Integer> lastIndex = new HashMap<>();
        int maxLen = 0;
        int left = 0; // start of sliding window

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // if we've seen 'c' inside the current window, move left
            if (lastIndex.containsKey(c) && lastIndex.get(c) >= left) {
                left = lastIndex.get(c) + 1;
            }

            // update last seen index of c
            lastIndex.put(c, right);

            // update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}