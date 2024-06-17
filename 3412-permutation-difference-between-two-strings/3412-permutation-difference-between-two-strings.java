class Solution 
{
    public int findPermutationDifference(String s, String t) 
    {
        LinkedHashMap<Character,Integer> map1=new LinkedHashMap<>();
        LinkedHashMap<Character,Integer> map2=new LinkedHashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map1.put(s.charAt(i),i);
        }
        for(int i=0;i<t.length();i++)
        {
            map2.put(t.charAt(i),i);
        }

        int sum=0;
        for(char i:map1.keySet())
        {
            sum=sum+Math.abs(map1.get(i)-map2.get(i));
        }

        return sum;
    }
}