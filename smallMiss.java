import java.util.*;
class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length;
        boolean[] seen = new boolean[value];
        
        for (int num : nums) {
            int mod = ((num % value) + value) % value; // Handle negative numbers
            seen[mod] = true;
        }
        
        for (int i = 0; i < value; i++) {
            if (!seen[i]) {
                return i;
            }
        }
        
        return value; // All remainders are seen, return value
    }
}