class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        int max=0;
        String str="";
        for(int i=0;i<k;i++)
        {
            char ch=s.charAt(i);
            str=str+Character.toString(ch);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            c++;
        }
        max=c;
        for(int i=k;i<s.length();i++)
        {
            int rem=(i-k);
            char c1=s.charAt(i);
            char c2=s.charAt(rem);
            if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u' || c1=='A' || c1=='E' || c1=='I' || c1=='O' || c1=='U')
            c=c+1;
            if(c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u' || c2=='A' || c2=='E' || c2=='I' || c2=='O' || c2=='U')
            c=c-1;
            max=Math.max(max,c);
        }
        return max;
    }
}