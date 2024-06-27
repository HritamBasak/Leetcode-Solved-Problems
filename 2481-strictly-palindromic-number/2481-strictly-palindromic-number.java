class Solution 
{
    public boolean checkPalindrome(int n,int i)
    {
        String str="";
        while(n>0)
        {
           int r=n%i;
           str=str+Integer.toString(r);
           n=n/i;
        }
        StringBuilder s=new StringBuilder(str);
        if(s.reverse().toString().equals(str))
        return true;
        else
        return false;
    }
    public boolean isStrictlyPalindromic(int n) 
    {
      boolean t=false;
      for(int i=2;i<=n-2;i++)
      {
          t=checkPalindrome(n,i);
          if(t==false)
          return false;
      }    
      return true;
    }
}