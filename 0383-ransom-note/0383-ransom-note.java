class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
        return false;
        if(ransomNote.equals(magazine))
        return true;
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();

        for(int i=0;i<ransomNote.length();i++)
        {
            char ch=ransomNote.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<magazine.length();i++)
        {
            char c=magazine.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char f:map.keySet())
        {
            if(!map1.containsKey(f))
            return false;
            else
            {
                if(map.get(f)>map1.get(f))
                return false;
            }
        }
        return true;
    }
}