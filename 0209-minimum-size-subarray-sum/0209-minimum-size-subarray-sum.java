class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int prefixSum = 0;
        int ans = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            prefixSum += nums[right];

            while (prefixSum >= target) {
                ans = Math.min(ans, right - left + 1);
                prefixSum -= nums[left];
                left++;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
