import java.util.*;
class Solution {
    public int strStr(String haystack, String needle) {
        
        if (haystack == null || needle == null || haystack.length() < needle.length()) {
            return -1;
        }

     
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }

        
        return -1;
    }
}