class Solution 
{
    public boolean isFascinating(int n) 
    {
      int mul1=n*2;
      int mul2=n*3;
      String str=(Integer.toString(n).concat(Integer.toString(mul1))).concat(Integer.toString(mul2));
      HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<str.length();i++)
      {
        map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
      }
      int c=0;
      for(char ch:map.keySet())
      {
        if(ch=='0')
        return false;

        if(map.get(ch)==1)
        c++;
      }
      if(c==9)
      return true;
      else
      return false;
    }
}