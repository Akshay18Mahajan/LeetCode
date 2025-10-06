class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; // no product can be < 1 if k <= 1

        int count = 0;
        int left = 0;
        long product = 1;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            // shrink window until product < k
            while (product >= k) {
                product /= nums[left];
                left++;
            }

            // all subarrays ending at right
            count += (right - left + 1);
        }
        return count;
    }
}
