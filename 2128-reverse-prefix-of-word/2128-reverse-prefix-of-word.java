class Solution {
    public String reversePrefix(String word, char ch) {
        String s="";
        int index=0;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(c!=ch)
            {
                s=s+Character.toString(c);
            }
            else
            {
                s=s+Character.toString(c);
                index=i+1;
                break;
            }
        }
        if(index==0)
        return word;

        StringBuilder str=new StringBuilder(s);
        String res=str.reverse().toString();

        String ans=res+word.substring(index,word.length());
        return ans;
    }
}