import java.util.List;

class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        if (n == 0) return 0;

        int count = 1; // To count the number of increasing subarrays
        int length = 1; // To track the length of the current increasing subarray

        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                length++;
            } else {
                if (length > 1) {
                    count += (length * (length - 1)) / 2; // Add the number of subarrays from the current increasing sequence
                }
                length = 1; // Reset length for the new sequence
            }
        }

        // If the last sequence was increasing, add its subarrays
        if (length > 1) {
            count += (length * (length - 1)) / 2;
        }

        return count;
    }
}