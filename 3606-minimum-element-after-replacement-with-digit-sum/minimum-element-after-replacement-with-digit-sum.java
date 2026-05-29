class Solution 
{
    public int minElement(int[] nums) 
    {
        int ans = Integer.MAX_VALUE;

        for (int num : nums) 
        {

            int sum = 0;

            // find digit sum
            while (num > 0) 
            {
                sum += num % 10;
                num = num / 10;
            }

            // store minimum digit sum
            ans = Math.min(ans, sum);
        }

        return ans;
    }
}