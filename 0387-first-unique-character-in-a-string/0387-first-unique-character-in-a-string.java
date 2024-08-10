class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char ch='0';
        for(Map.Entry<Character,Integer> m:map.entrySet())
        {
            if(m.getValue()==1){
                ch=m.getKey();
                break;
            }
        }
        return ch=='0'?-1:s.indexOf(ch);
    }
}