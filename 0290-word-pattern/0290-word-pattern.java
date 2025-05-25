class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[]=s.split(" ");

        if(pattern.length()!=words.length)
        return false;

        Map<Character,String> m=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            String sf=words[i];
            if(!m.containsKey(ch))
            {
                if(set.contains(sf))
                return false;

                set.add(sf);
                m.put(ch,sf);
            }
            else
            {
                String need=m.get(ch);//cat
                if(!need.equals(sf))//cat!=cat
                return false;
            }
        }
        return true;
    }
}