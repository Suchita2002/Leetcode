class Solution 
{
    public String capitalizeTitle(String title) 
    {
        String str = title.toLowerCase();
        String[] arr = str.split(" ");
        String ans = "";

        for(String word : arr)
        {
            if(word.length() > 2)
            {
                ans += Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
            else
            {
                ans += word;
            }

            ans += " ";
        }

        return ans.trim();
    }
}