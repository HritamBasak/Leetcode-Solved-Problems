class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
            c++;
        }
        return c;
    }
}