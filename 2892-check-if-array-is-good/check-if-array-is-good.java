import java.util.Arrays;

class Solution 
{
    public boolean isGood(int[] nums) 
    {

        Arrays.sort(nums);

        int n = nums.length - 1;

        // Check 1 to n-1
        for (int i = 0; i < n; i++) 
        {
            if (nums[i] != i + 1) 
            {
                return false;
            }
        }

        // Last element must be n
        return nums[nums.length - 1] == n;
    }
}