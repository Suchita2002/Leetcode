class Solution 
{
    public String makeSmallestPalindrome(String s) 
    {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while(left < right)
        {
            if(left < right)
            {
                char smaller = (char)(Math.min(arr[left], arr[right]));
                arr[left] = smaller;
                arr[right] = smaller;
            }
            left++;
            right--;
        }
        return new String(arr);
    }
}