class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int count=0;
        int preSum = 0;

        Map<Integer , Integer> mpp= new HashMap<>();
        mpp.put(0,1);

        for(int num: nums)
        {
            preSum+=num;
        

        if(mpp.containsKey(preSum-k))
        {
             count =count+ mpp.get(preSum-k);
        }

        mpp.put(preSum, mpp.getOrDefault(preSum, 0)+1);
        }

        return count;
    }
}