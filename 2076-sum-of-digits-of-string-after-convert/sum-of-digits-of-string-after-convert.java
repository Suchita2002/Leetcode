class Solution 
{
    public int getLucky(String s, int k) 
    {
        String ans = "";
	
		int sum = 0;
		for(int i = 0 ; i < s.length() ; i++)
		{
			ans += (s.charAt(i) - 'a' + 1);
		}
		for(int i = 0 ; i < ans.length() ; i++)
		{
			sum += ans.charAt(i) - '0';
		}
		k--;
		
		while(k != 0)
		{
			int temp = 0;
			while(sum != 0)
			{
				temp += sum%10;
				sum /= 10;
			}
			sum = temp;
			k--;
		}
		return sum;
    }
}