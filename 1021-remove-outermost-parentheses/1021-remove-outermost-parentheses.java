class Solution 
{
    public String removeOuterParentheses(String s) 
    {
      String str="";
      int c=0;
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        if(ch=='(')
        {
            c++;
            if(c!=1)
            str+=Character.toString(ch);
        }
        if(ch==')')
        {
            c--;
            if(c!=0)
            str+=Character.toString(ch);
        }
      }
      return str;
    }
}