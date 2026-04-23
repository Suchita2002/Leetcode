class Solution 
{
    public int[] numberGame(int[] nums) 
    {

        int n = nums.length;
        int[] arr = new int[n];
        int k = 0;

        while (n > 0) 
        {

            int min1 = 0;
            for (int i = 1; i < n; i++) 
            {
                if (nums[i] < nums[min1]) 
                {
                    min1 = i;
                }
            }
            int alice = nums[min1];

            // remove min1
            for (int i = min1; i < n - 1; i++) 
            {
                nums[i] = nums[i + 1];
            }
            n--;

            // find next minimum (Bob)
            int min2 = 0;
            for (int i = 1; i < n; i++) 
            {
                if (nums[i] < nums[min2])
                {
                    min2 = i;
                }
            }
            int bob = nums[min2];

            // remove min2
            for (int i = min2; i < n - 1; i++) 
            {
                nums[i] = nums[i + 1];
            }
            n--;

            // add to result
            arr[k++] = bob;
            arr[k++] = alice;
        }

        return arr;
    }
}