class Solution 
{
    public String reverseWords(String s) 
    {
        String ans = "";
        String str = "";

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch != ' ')
            {
                str = ch + str;
            }
            else
            {
                ans = ans + str + " ";
                str = "";
            }
        }

        // add last word
        ans = ans + str;

        return ans;
    }
}