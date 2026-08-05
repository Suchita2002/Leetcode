class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int max = candies[0];
        for(int i = 0; i < candies.length; i++)
        {
            if(candies[i] > max)
            {
                max = candies[i];
            }
        }
        ArrayList al = new ArrayList();

        for(int i = 0; i < candies.length; i++)
        {
            if(candies[i] + extraCandies >= max)
            {
                al.add(true);
            }
            else
            {
                al.add(false);
            }
        }
        return al;
    }
}