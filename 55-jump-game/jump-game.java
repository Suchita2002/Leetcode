class Solution 
{
    public boolean canJump(int[] nums) 
    {
        int max = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (i > max)
            {
                return false;
            }

            int reach = i + nums[i];
            if (reach > max)
            {
                max = reach;
            }

            if (max >= nums.length - 1)
            {
                return true;
            }
        }

        return true;
    }
}