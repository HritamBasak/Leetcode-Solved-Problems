class Solution 
{
    public int maxLengthBetweenEqualCharacters(String s) 
    {
      HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<s.length();i++)
      {
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
      }    
      int max=-1;
      for(char ch:map.keySet())
      {
        if(map.get(ch)>1)
        {
            int fi=s.indexOf(ch);
            int li=s.lastIndexOf(ch);
            max=Math.max(max,(li-fi)-1);
        }
      }
      return max;
    }
}