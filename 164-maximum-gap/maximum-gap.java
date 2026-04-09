class Solution 
{
    public int maximumGap(int[] nums) 
    {
        Arrays.sort(nums);
        if(nums.length <= 1)
        {
            return 0;
        }
        int max = 0;
        for(int i = 1 ; i < nums.length ; i++)
        {
            int diff = nums[i]-nums[i-1];
            if(diff > max)
            {
               max = diff;
            }
        }
        return max;
    }
}