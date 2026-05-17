class Solution 
{
    public String reverseWords(String s) 
    {
        String ans = "";
        String word = "";

        for(int i = s.length() - 1; i >= 0; i--)
        {
            char ch = s.charAt(i);

            if(ch != ' ')
            {
                word = ch + word;
            }
            else
            {
                if(word.length() > 0)
                {
                    ans = ans + word + " ";
                    word = "";
                }
            }
        }

        if(word.length() > 0)
        {
            ans = ans + word;
        }

        return ans.trim();
    }
}