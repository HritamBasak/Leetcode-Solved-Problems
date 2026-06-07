class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);        
        }
        for(Map.Entry<Character,Integer> m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        for(Map.Entry<Character,Integer> m:map1.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        for(char i:map.keySet())
        {
            if(!map1.containsKey(i))
            return false;

            else
            {
                if(!map.get(i).equals(map1.get(i)))
                return false;
            }
        }
        return true;
    }
}