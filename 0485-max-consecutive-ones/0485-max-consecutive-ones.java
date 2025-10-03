class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int k=0;
        int max1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1) k++;
             else k=0;

             max1=Math.max(k,max1);
        }

        return max1;
    }
}