class Solution 
{
    public int findGCD(int[] nums) 
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for(int i = 0; i < nums.length; i++)
        {
           if(nums[i] < min)
           {
                min = nums[i];
           }

           if(nums[i] > max)
           {
                max = nums[i];
           }
        }
        int i = 1;
        while(i <= min)
        {
            if(min % i == 0 && max % i == 0)
            {
                temp = i;
            }
            i++;
        }
        return temp;
    }
}