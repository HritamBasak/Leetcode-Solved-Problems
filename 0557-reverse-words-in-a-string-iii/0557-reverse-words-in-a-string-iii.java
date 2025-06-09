class Solution {
    public String reverseWords(String s) {
        int pos=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<=s.length();i++)
        {
            if(i==s.length() || s.charAt(i)==' ')
            {
                for(int j=i-1;j>=pos;j--)
                {
                    sb.append(s.charAt(j));
                }
                if(i!=s.length())
                sb.append(' ');

                pos=i+1;
            }
        }
        return sb.toString();
    }
}
