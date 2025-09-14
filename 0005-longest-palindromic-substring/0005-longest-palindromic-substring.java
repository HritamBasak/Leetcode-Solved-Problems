class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)
        return s;
        int max=0;
        String res="";
        String maxStr="";
        for(int i=1;i<s.length();i++)
        {
            int low=i;
            int high=i;
            while(s.charAt(low)==s.charAt(high))
            {
                    low--;
                    high++;
                    if(low<=-1 || high>=s.length())
                    break; 
            }
            res=s.substring(low+1,high);
            if(res.length()>max)
            {
                max=Math.max(res.length(),max);
                maxStr=res;
            }
            low=i-1;
            high=i;
            while(s.charAt(low)==s.charAt(high))
            {
                    low--;
                    high++;
                    if(low<=-1 || high>=s.length())
                    break;
            }
            res=s.substring(low+1,high);
            if(res.length()>max)
            {
                max=Math.max(res.length(),max);
                maxStr=res;
            }
        }
        return maxStr;
    }
}