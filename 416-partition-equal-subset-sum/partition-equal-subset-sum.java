class Solution 
{
    public boolean canPartition(int[] nums) 
    {
        int sum = 0;

        for (int num : nums)
        {
            sum += num;
        }

        // If total sum is odd, cannot partition equally
        if ((sum & 1) == 1) 
        {
            return false;
        }

        int target = sum / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) 
        {
            // Traverse backwards
            for (int j = target; j >= num; j--) 
            {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }
}