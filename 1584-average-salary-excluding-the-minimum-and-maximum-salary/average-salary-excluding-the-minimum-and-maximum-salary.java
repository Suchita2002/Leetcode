class Solution 
{
    public double average(int[] salary) 
    {
        Arrays.sort(salary);
        double ans = 0;
        int k = 0;
        for(int i = 1; i < salary.length-1; i++)
        {
            ans = ans + salary[i];
            k++;
        }

        return ans / k;
    }
}