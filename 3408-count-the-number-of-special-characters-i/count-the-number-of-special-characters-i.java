class Solution 
{
    public int numberOfSpecialChars(String word) 
    { int count = 0;
        for(char ch = 'a' ; ch <= 'z' ; ch++)
        {
            boolean capital = false;
            boolean small = false;
           
            for(int i = 0; i < word.length(); i++)
            {
                char letter = word.charAt(i);

                if(letter == Character.toUpperCase(ch))
                    capital = true;
                if(letter == ch)
                    small = true;
            }
            if(capital && small)
            {
                count++;
            }
        }
        return count;
    }
}