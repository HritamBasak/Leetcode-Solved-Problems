class Solution {
    public boolean areOccurrencesEqual(String s) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        if(map.size()==1)
        return true;
        char ch=s.charAt(0);
        int num=map.get(ch);
        for(char c:map.keySet())
        {
            if(map.get(c)!=num)
            return false;
        }
        return true;
    }
}