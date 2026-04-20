class Solution
 {
    public int maxDistance(int[] colors) 
    {
        int dist = 0 ;

        for(int i = colors.length-1 ; i >= 0 ; i--)
        {
            if(colors[i] != colors[0])
            {
                dist = i;
                break; 
            }
        }

        for(int i = 0 ; i < colors.length ; i++)
        {
            if(colors[i] != colors[colors.length-1])
            {
                dist = Math.max(dist, colors.length-1-i);
                break;
            }
        }
        return dist;
    }
}
