import java.util.*;
class Solution {
    public String removeDuplicates(String str) {

       char stack[]=new char[str.length()];
       char ch[]=str.toCharArray();
       int top=-1;
       for(int i=0; i<ch.length;i++){
          boolean flag= (top == -1);
          if(!flag && stack[top]==ch[i]){
             char c=stack[top];
             top=top-1;
          }
          else{
            top = top+1;
            stack[top]=ch[i];
          }
       }
    StringBuffer sb= new StringBuffer();
      for(int i=0; i<=top; i++){
          sb.append(stack[i]);
      }
      return sb.toString();
    }
}
