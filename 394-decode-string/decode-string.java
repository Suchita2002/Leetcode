import java.util.Stack;

class Solution 
{
    public String decodeString(String s)
     {

        Stack<Integer> number = new Stack<>();
        Stack<String> string = new Stack<>();

        String current = "";
        int num = 0;

        for (int i = 0; i < s.length(); i++) 
        {

            char ch = s.charAt(i);

           
            if (ch >= '0' && ch <= '9') 
            {
                num = num * 10 + (ch - '0');
            }

            
            else if (ch == '[') 
            {
                number.push(num);
                string.push(current);

                num = 0;
                current = "";
            }

         
            else if (ch == ']') 
            {

                int n = number.pop();
                String old = string.pop();

                String temp = "";

                for (int j = 0; j < n; j++) 
                {
                    temp = temp + current;
                }

                current = old + temp;
            }

          
            else 
            {
                current = current + ch;
            }
        }

        return current;
    }
}