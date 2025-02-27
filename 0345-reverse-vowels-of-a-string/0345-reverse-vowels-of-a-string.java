class Solution {
    public String reverseVowels(String s) {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' ||  ch=='O' || ch=='U')
            str=str+Character.toString(ch);
        }
        int n=str.length();
        //int j=0;
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' ||  c=='O' || c=='U')     {
                res=res+Character.toString(str.charAt(n-1));
                n--;
            }
            else
            {
                res=res+Character.toString(c);
            }
        }
        return res;
    }
}