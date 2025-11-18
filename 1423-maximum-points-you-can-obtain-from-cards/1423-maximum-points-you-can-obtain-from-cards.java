class Solution {
    public int maxScore(int[] cardPoints, int k) 
    {
        int maxSum=0;
        int total=0;
       int n =cardPoints.length;

        for(int i =0;i<k;i++)
        {
            total=total+cardPoints[i];
        }
        maxSum=total;
        for(int i=0;i<k;i++)
        {
            total=total-cardPoints[k-1-i];
            total=total+cardPoints[n-1-i];
            maxSum= Math.max(maxSum, total);
        }
        return maxSum;
    }
}