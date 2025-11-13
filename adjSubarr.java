import java.util.List;

class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        if (n == 0) return 0;

        int count = 1; 
        int length = 1; 

        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                length++;
            } else {
                if (length > 1) {
                    count += (length * (length - 1)) / 2; 
                }
                length = 1; 
            }
        }
        if (length > 1) {
            count += (length * (length - 1)) / 2;
        }

        return count;
    }
}