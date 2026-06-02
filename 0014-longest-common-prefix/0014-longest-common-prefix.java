class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String res="";
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int idx1=0,idx2=0;
        while(idx1<s1.length() && idx2<s2.length())
        {
            if(s1.charAt(idx1)==s2.charAt(idx2))
            {
                res+=Character.toString(strs[0].charAt(idx1));
                idx1++;
                idx2++;
            }
            else
            break;
        }
        return res;
    }
}