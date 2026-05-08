class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        int k = 0;
        String ch = "";
        for(int i = 0; i <= haystack.length() - needle.length(); i++)
        {
            ch = "";
            for(int j = i; j < i + needle.length(); j++)
            {
                ch += haystack.charAt(j);
                if(ch.equals(needle))
                {
                    return i;
                }
            }
        }
        return -1;
    }
}