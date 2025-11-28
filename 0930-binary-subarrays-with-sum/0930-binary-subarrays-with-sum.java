class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) 
    {
        int prefix=0; int cnt=0;  
        Map<Integer , Integer> mpp= new HashMap<>();
        mpp.put(0,1);
        for(int num:nums)
        {
            prefix+=num;

            if(mpp.containsKey(prefix-goal))
            cnt=cnt+mpp.get(prefix-goal);

             mpp.put(prefix, mpp.getOrDefault(prefix, 0) + 1);
        }
        return cnt;
    }
}