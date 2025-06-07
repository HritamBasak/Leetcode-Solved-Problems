class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int total=0;
        int l=s.length();
        int left=0;
        for(int i=0;i<l;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.containsKey('a') && map.containsKey('b') && map.containsKey('c'))
            {
                total+=l-i;
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0)
                map.remove(s.charAt(left));
                left++;
            }
        }
        return total;
    }
}