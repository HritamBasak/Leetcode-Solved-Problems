class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)
        return s;
        int maxLen=0;
        String maxStr="";
        for(int i=1;i<s.length();i++)
        {
            //for odd length
            int l=i;
            int h=i;
            while(s.charAt(l)==s.charAt(h))
            {
                l--;
                h++;
                if(l==-1 || h==s.length())
                break;
            }
            String str=s.substring(l+1,h);
            if(str.length()>maxLen)
            {
                maxLen=str.length();
                maxStr=str;
            }
            l=i-1;
            h=i;
            while(s.charAt(l)==s.charAt(h))
            {
                l--;
                h++;
                if(l==-1 || h==s.length())
                break;
            }
            str=s.substring(l+1,h);
            if(str.length()>maxLen)
            {
                maxLen=str.length();
                maxStr=str;
            }
        }
        return maxStr;
    }
}