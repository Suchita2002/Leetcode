class Solution 
{
    public int search(int[] nums, int target) 
    {
        int index = -1,i = 0, j = nums.length-1;
        while(i <= j)
        {
            int mid = i +(j-i) / 2; 
            if(nums[mid] == target)
            {
                index = mid;
                break;
            }

            if(nums[mid] < target)
            {
                i = mid + 1;
            }
            else
            {
                j = mid - 1;
            }
        }
        /*if(index != -1)
        {
            return index;
        }
        else*/
        return index;
    }
}