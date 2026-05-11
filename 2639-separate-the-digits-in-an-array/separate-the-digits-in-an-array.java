class Solution 
{
    public int[] separateDigits(int[] nums) 
    {
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int num = nums[i];
            while(num > 0)
            {
                count++;
                num = num / 10;  
            }
        }

        int ans[] = new int[count];
        int k = 0;

        for(int i = 0; i < nums.length; i++)
        {
            int temp = nums[i];
            int div = 1;

            while(temp / div >= 10)
            {
                div = div * 10;
            } 

            while(div > 0)
            {
                ans[k++] = temp / div;
                temp = temp % div;
                div = div / 10;
            }
        }
        return ans;
    }
}