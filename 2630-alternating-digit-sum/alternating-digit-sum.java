class Solution 
{
    public int alternateDigitSum(int n) 
    {
        int ans = 0, div = 1;
		int temp = n; // 521
		
		while(temp / div >= 10)
		{
			div *= 10; // 100
		}
		//521
		
		boolean flag = true;
		while( div > 0)
		{
			//div =10
			int rem = temp / div; //2
			temp = temp % div; //1
			
			if(flag)
			{
				ans += rem; //5
				flag = false;
			}
			else
			{
				ans -= rem; //3
				flag = true;
			}
			
			div/=10;
		}
		return ans;
    }
}