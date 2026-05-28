class Solution 
{
    public int minimumCost(int[] nums) 
    {
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                int first = nums[0];
                int second = nums[i];
                int third = nums[j];

                int sum = first + second + third;
                if(sum < min)
                    min = sum;
            }
        }
        return min;
    }
}