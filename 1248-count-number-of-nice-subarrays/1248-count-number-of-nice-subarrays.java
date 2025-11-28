class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);

        int prefix = 0;
        int ans = 0;

        for (int num : nums) 
        {
            if (num % 2 != 0) prefix++;

            ans= ans+mpp.getOrDefault(prefix-k , 0);
            mpp.put(prefix, mpp.getOrDefault(prefix,0)+1);
        }
        return ans;
    }
}