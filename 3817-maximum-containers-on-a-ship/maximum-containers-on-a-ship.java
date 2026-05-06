class Solution 
{
    public int maxContainers(int n, int w, int maxWeight) 
    {
        n = n * n;
        int temp = maxWeight / w;
        return Math.min(n,temp);
    }
}