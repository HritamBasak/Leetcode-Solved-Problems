class Solution {
    public int subtractProductAndSum(int n) {
        int p=1,s=0;
        while(n>0)
        {
            int r=n%10;
            s=s+r;
            p=p*r;
            n=n/10;
        }
        int diff=p-s;
        return diff;
    }
}