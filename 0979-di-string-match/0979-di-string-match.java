class Solution {
    public int[] diStringMatch(String s) {
        int low=0,high=s.length();
        int res[]=new int[s.length()+1];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='I')
            {
                res[i]=low;
                low++;
            }
            else
            {
                res[i]=high;
                high--;
            }
        }
        if(s.charAt(s.length()-1)=='I')
        res[s.length()]=high;
        else
        res[s.length()]=low;
        return res;
    }
}