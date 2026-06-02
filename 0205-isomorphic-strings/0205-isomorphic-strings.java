class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        int idx1=0,idx2=0;
        while(idx1<s.length() && idx2<t.length())
        {
            if(!map.containsKey(s.charAt(idx1)))
            {
                char ch1=s.charAt(idx1);
                char ch2=t.charAt(idx2);
                if(!map.containsValue(ch2))
                {
                map.put(ch1,ch2);// e-a  g-d  
                idx1++;
                idx2++;
                }
                else
                return false;
            }
            else
            {
                if(map.get(s.charAt(idx1))!=t.charAt(idx2))
                return false;
                else
                {
                    idx1++;
                    idx2++;
                }
            }
        }
        return true;
    }
}